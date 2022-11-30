import com.google.protobuf.ByteString;
import generated.*;
import io.grpc.stub.StreamObserver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Optional;
import java.util.regex.Pattern;

public class ArchiveManagerService extends ArchiveManagerServiceGrpc.ArchiveManagerServiceImplBase {

    private String path = "C:\\Users\\nicolas_josino\\IdeaProjects\\gRPC-Archive-Server\\archives";

    @Override
    public void listFiles(Empty request, StreamObserver<ContentsResponse> responseObserver) {
        ContentsResponse response;
        StringBuilder contents = new StringBuilder();
        File serverFolder = new File(path);
        String responseMessage;

        if (serverFolder.exists()) {
            if (serverFolder.isDirectory()) {
                File[] dir = serverFolder.listFiles();
                if (dir != null) {
                    for (File f : dir) {
                        contents.append(f.getName()).append(';');
                    }
                }
                responseMessage = "Success";
            } else {
                responseMessage = "Server is not a folder";
            }
        } else responseMessage = "Server folder does not exist!";

        response = ContentsResponse.newBuilder().
                setContents(contents.toString()).
                setResponseMessage(responseMessage).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    public File findArchive(Request request) {
        File serverFolder = new File(path);
        File[] folderContents = serverFolder.listFiles();

        assert folderContents != null;
        Optional<File> archive = Arrays.stream(folderContents)
                .filter(item -> request.getName().equals(item.getName()))
                .findFirst();

        return archive.orElse(null);
    }

    @Override
    public void getArchive(Request request, StreamObserver<ArchiveResponse> responseObserver) {
        ArchiveResponse response;
        File archive = findArchive(request);

        byte[] contents = new byte[0];
        if (archive.exists()) {
            try {
                contents = Files.readAllBytes(archive.toPath());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        response = ArchiveResponse.newBuilder().
                setContents(ByteString.copyFrom(contents)).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteArchive(Request request, StreamObserver<Response> responseObserver) {
        super.deleteArchive(request, responseObserver);
    }

    @Override
    public void listChildren(Request request, StreamObserver<ContentsResponse> responseObserver) {
        ContentsResponse response;
        String responseMessage;
        StringBuilder contents = new StringBuilder();
        File directory = Paths.get(path, request.getName()).toFile();
        File[] directoryContents = directory.listFiles();

        if (!directory.isDirectory()) {
            responseMessage = "Request is not a directory!";
        } else {
            assert directoryContents != null;
            for (File f : directoryContents)
                contents.append(f.getName()).append(';');
            responseMessage = "Listing files from " + directory.getPath();
        }

        response = ContentsResponse.newBuilder().
                setContents(contents.toString()).
                setResponseMessage(responseMessage).
                build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void sendArchive(SendRequest request, StreamObserver<Response> responseObserver) {
        super.sendArchive(request, responseObserver);
    }

    @Override
    public void pwd(Empty request, StreamObserver<ContentsResponse> responseObserver) {
        ContentsResponse response = ContentsResponse.newBuilder().
                setContents(path).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void changeDirectoryUp(Empty request, StreamObserver<Response> responseObserver) {
        String[] newPath = path.split(Pattern.quote(File.separator));
        newPath = Arrays.copyOf(newPath, newPath.length - 1);

        path = String.join("\\", newPath);

        Response response = Response.newBuilder().
                setResponseMessage("Path moved up to: " + path).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void changeDirectoryDown(Request request, StreamObserver<Response> responseObserver) {
        String responseMessage;
        File newPathFile = findArchive(request);
        if (newPathFile.exists()) {
//            path += "\\" + request.getName();
            path = newPathFile.getAbsolutePath();
            responseMessage = "Path moved down to: " + path;
        } else {
            responseMessage = "Informed new path not found";
        }

        Response response = Response.newBuilder().setResponseMessage(responseMessage).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}