import com.google.protobuf.ByteString;
import generated.*;
import io.grpc.stub.StreamObserver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

public class ArchiveManagerService extends ArchiveManagerServiceGrpc.ArchiveManagerServiceImplBase {

    private String path = System.getProperty("user.dir");

    @Override
    public void listFiles(ListFilesRequest request, StreamObserver<ListFilesResponse> responseObserver) {
        ListFilesResponse response;
        List<String> contents = new ArrayList<>();
        File serverFolder = new File(path);
        String responseMessage;

        if (serverFolder.exists()) {
            if (serverFolder.isDirectory()) {
                File[] dir = serverFolder.listFiles();
                if (dir != null) {
                    for (File f : dir) {
                        contents.add(f.getName());
                    }
                }
                responseMessage = "Success";
            } else {
                responseMessage = "Server is not a folder";
            }
        } else responseMessage = "Server folder does not exist!";

        response = ListFilesResponse.newBuilder().
                addAllContents(contents).
                setResponseMessage(responseMessage).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    public File findArchive(String name) {
        File serverFolder = new File(path);
        File[] folderContents = serverFolder.listFiles();

        assert folderContents != null;
        Optional<File> archive = Arrays.stream(folderContents)
                .filter(item -> name.equals(item.getName()))
                .findFirst();

        return archive.orElse(null);
    }

    @Override
    public void getArchive(GetArchiveRequest request, StreamObserver<GetArchiveResponse> responseObserver) {
        GetArchiveResponse response;
        String responseMessage;
        File archive = findArchive(request.getName());

        byte[] contents = new byte[0];
        if (archive != null) {
            try {
                contents = Files.readAllBytes(archive.toPath());
                responseMessage = request.getName() + " found.";
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else responseMessage = request.getName() + " not found";

        response = GetArchiveResponse.newBuilder().
                setContents(ByteString.copyFrom(contents)).
                setResponseMessage(responseMessage).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteArchive(DeleteArchiveRequest request, StreamObserver<DeleteArchiveResponse> responseObserver) {
        File toDelete = findArchive(request.getName());
        String responseMessage;
        DeleteArchiveResponse response;

        if (toDelete != null) {
            if (toDelete.delete())
                responseMessage = toDelete.getName() + " deleted";
            else
                responseMessage = toDelete.getName() + " not deleted";
        } else responseMessage = "File not found";

        response = DeleteArchiveResponse.newBuilder().
                setResponseMessage(responseMessage).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void listChildren(ListChildrenRequest request, StreamObserver<ListChildrenResponse> responseObserver) {
        ListChildrenResponse response;
        String responseMessage;
        List<String> contents = new ArrayList<>();
        File directory = Paths.get(path, request.getName()).toFile();
        File[] directoryContents = directory.listFiles();

        if (!directory.isDirectory()) {
            responseMessage = "Request is not a directory!";
        } else {
            assert directoryContents != null;
            for (File f : directoryContents)
                contents.add(f.getName());
            responseMessage = "Listing files from " + directory.getPath();
        }

        response = ListChildrenResponse.newBuilder().
                addAllContents(contents).
                setResponseMessage(responseMessage).
                build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void sendArchive(SendArchiveRequest request, StreamObserver<SendArchiveResponse> responseObserver) {
        File toSend = new File(path + "\\" + request.getName());
        SendArchiveResponse response;
        String responseMessage;

        try {
            if (toSend.createNewFile()) {
                Files.write(toSend.toPath(), request.getContents().toByteArray());
                responseMessage = toSend.getName() + " sent";
            } else {
                responseMessage = request.getName() + " already exists in path";
            }

            response = SendArchiveResponse.newBuilder().
                    setResponseMessage(responseMessage).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void pwd(PwdRequest request, StreamObserver<PwdResponse> responseObserver) {
        PwdResponse response = PwdResponse.newBuilder().
                setResponseMessage(path).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void changeDirectoryUp(ChangeDirectoryUpRequest request, StreamObserver<ChangeDirectoryUpResponse> responseObserver) {
        String[] newPath = path.split(Pattern.quote(File.separator));
        newPath = Arrays.copyOf(newPath, newPath.length - 1);

        path = String.join("\\", newPath);

        ChangeDirectoryUpResponse response = ChangeDirectoryUpResponse.newBuilder().
                setResponseMessage("Path moved up to: " + path).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void changeDirectoryDown(ChangeDirectoryDownRequest request, StreamObserver<ChangeDirectoryDownResponse> responseObserver) {
        String responseMessage;
        File newPathFile = findArchive(request.getName());
        if (newPathFile != null) {
            path = newPathFile.getAbsolutePath();
            responseMessage = "Path moved down to: " + path;
        } else {
            responseMessage = "Informed path not found";
        }

        ChangeDirectoryDownResponse response = ChangeDirectoryDownResponse.newBuilder().setResponseMessage(responseMessage).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}