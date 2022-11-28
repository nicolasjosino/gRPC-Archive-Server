import com.google.protobuf.ByteString;
import generated.*;
import io.grpc.stub.StreamObserver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Optional;

public class ArchiveManagerService extends ArchiveManagerServiceGrpc.ArchiveManagerServiceImplBase {

    private String path = "C:\\Users\\nicolas_josino\\IdeaProjects\\gRPC-Archive-Server\\archives";

    @Override
    public void listFiles(Empty request, StreamObserver<StringResponse> responseObserver) {
        StringResponse response;
        APIResponse APIresponse;
        String responseMessage;
        int responseCode;
        StringBuilder contents = new StringBuilder();
        File serverFolder = new File(path);

        if (serverFolder.exists()) {
            if (serverFolder.isDirectory()) {
                System.out.println("Listing files:");

                File[] dir = serverFolder.listFiles();
                if (dir != null) {
                    for (File f : dir) {
                        contents.append(f.getName()).append(';');
                    }
                }
                responseMessage = "success";
                responseCode = 200;
            } else {
                responseMessage = "Server is not a folder";
                responseCode = 500;
            }
        } else {
            responseMessage = "File does not exist!";
            responseCode = 500;
        }

        APIresponse = APIResponse.newBuilder().
                setResponseCode(responseCode).
                setResponseMessage(responseMessage).build();
        response = StringResponse.newBuilder().
                setResponse(APIresponse).
                setContents(contents.toString()).
                build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getArchive(Request request, StreamObserver<ArchiveResponse> responseObserver) {
        ArchiveResponse response;
        APIResponse APIresponse;
        String responseMessage;
        int responseCode;
        File serverFolder = new File(path);
        File[] folderContents = serverFolder.listFiles();
        byte[] contents = new byte[0];

        assert folderContents != null;
        Optional<File> archive = Arrays.stream(folderContents)
                .filter(item -> request.getName().equals(item.getName()))
                .findFirst();

        if (archive.isPresent()) {
            responseCode = 200;
            responseMessage = "File found!";
            try {
                contents = Files.readAllBytes(archive.get().toPath());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        else {
            responseCode = 400;
            responseMessage = "File not found!";
        }

        APIresponse = APIResponse.newBuilder().
                setResponseCode(responseCode).
                setResponseMessage(responseMessage).build();

        response = ArchiveResponse.newBuilder().
                setResponse(APIresponse).
                setContents(ByteString.copyFrom(contents)).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteArchive(Request request, StreamObserver<APIResponse> responseObserver) {
        super.deleteArchive(request, responseObserver);
    }

    @Override
    public void listChildren(Request request, StreamObserver<StringResponse> responseObserver) {
        StringResponse response;
        APIResponse APIresponse;
        String responseMessage;
        int responseCode;
        StringBuilder contents = new StringBuilder();
        File directory = Paths.get(path, request.getName()).toFile();
        File[] directoryContents = directory.listFiles();

        if (!directory.isDirectory()) {
            responseCode = 500;
            responseMessage = "Request is not a directory!";
        } else {
            assert directoryContents != null;
            for (File f : directoryContents)
                contents.append(f.getName()).append(';');
            responseCode = 200;
            responseMessage = "Listing files from " + directory.getPath();
        }

        APIresponse = APIResponse.newBuilder().
                setResponseCode(responseCode).
                setResponseMessage(responseMessage).build();
        response = StringResponse.newBuilder().
                setResponse(APIresponse).
                setContents(contents.toString()).
                build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void sendArchive(SendRequest request, StreamObserver<APIResponse> responseObserver) {
        super.sendArchive(request, responseObserver);
    }

    @Override
    public void pwd(Empty request, StreamObserver<StringResponse> responseObserver) {
        super.pwd(request, responseObserver);
    }
}
