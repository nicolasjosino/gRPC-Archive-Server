import generated.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Client {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        ArchiveManagerServiceGrpc.ArchiveManagerServiceBlockingStub stub
                = ArchiveManagerServiceGrpc.newBlockingStub(channel);

        ChangeDirectoryDownResponse directoryDown
                = stub.changeDirectoryDown(ChangeDirectoryDownRequest.newBuilder()
                .setName("archives")
                .build());

        System.out.println(directoryDown);

        ListFilesResponse listFilesResponse = stub.listFiles(ListFilesRequest.newBuilder().build());

        System.out.println(listFilesResponse);

        GetArchiveResponse getArchive = stub.getArchive(GetArchiveRequest.newBuilder()
                                                        .setName("textfile.txt")
                                                        .build());

        System.out.println(getArchive);

         channel.shutdown();
    }
}
