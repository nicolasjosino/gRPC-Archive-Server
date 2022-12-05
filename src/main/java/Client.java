import com.google.protobuf.ByteString;
import generated.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();
        ArchiveManagerServiceGrpc.ArchiveManagerServiceBlockingStub stub
                = ArchiveManagerServiceGrpc.newBlockingStub(channel);

        menu();
        Scanner name = new Scanner(System.in);

        while (true) {
            System.out.print("Choose a procedure to call: ");
            int selection = new Scanner(System.in).nextInt();

            switch (selection) {
                case 0: System.exit(0);

                case 1:
                    callListFiles(stub);
                    break;

                case 2:
                    System.out.print("Write the desired file name: ");
                    String getFile = name.nextLine();
                    callGetArchive(stub, getFile);
                    break;

                case 3:
                    System.out.print("Write the file name to be deleted: ");
                    String deleteFile = name.nextLine();
                    callDeleteArchive(stub, deleteFile);
                    break;

                case 4:
                    System.out.print("Write the directory to be listed: ");
                    String dir = name.nextLine();
                    callListChildren(stub, dir);
                    break;

                case 5:
                    System.out.print("Write the file name to be sent: ");
                    String fileName = name.nextLine();
                    System.out.println("Write the file's content: ");
                    String content = new Scanner(System.in).nextLine();
                    callSendArchive(stub, fileName, ByteString.copyFromUtf8(content));
                    break;

                case 6:
                    callPwd(stub);
                    break;

                case 7:
                    callChangeDirUp(stub);
                    break;

                case 8:
                    System.out.print("Write the folder name to access: ");
                    String dirDown = name.nextLine();
                    callChangeDirDown(stub, dirDown);
                    break;

                default:
                    System.out.println("Choose a valid option!");
                    break;
            }
        }

    }

    public static void menu() {
        System.out.println("Available procedures");
        System.out.println("0 - Quit");
        System.out.println("1 - List files");
        System.out.println("2 - Get archive");
        System.out.println("3 - Delete archive");
        System.out.println("4 - List children");
        System.out.println("5 - Send archive");
        System.out.println("6 - Current directory (pwd)");
        System.out.println("7 - Change directory up");
        System.out.println("8 - Change directory down");
    }

    public static void callListFiles(ArchiveManagerServiceGrpc.ArchiveManagerServiceBlockingStub stub) {
        ListFilesResponse response = stub.listFiles(ListFilesRequest.newBuilder().build());
        System.out.println(response);
    }

    public static void callGetArchive(ArchiveManagerServiceGrpc.ArchiveManagerServiceBlockingStub stub,
                                      String name) {
        GetArchiveRequest request = GetArchiveRequest.newBuilder().setName(name).build();
        GetArchiveResponse response = stub.getArchive(request);
        System.out.println(response);
    }

    public static void callDeleteArchive(ArchiveManagerServiceGrpc.ArchiveManagerServiceBlockingStub stub,
                                         String name) {
        DeleteArchiveRequest request = DeleteArchiveRequest.newBuilder().setName(name).build();
        DeleteArchiveResponse response = stub.deleteArchive(request);
        System.out.println(response);
    }

    public static void callListChildren(ArchiveManagerServiceGrpc.ArchiveManagerServiceBlockingStub stub,
                                        String name) {
        ListChildrenRequest request = ListChildrenRequest.newBuilder().setName(name).build();
        ListChildrenResponse response = stub.listChildren(request);
        System.out.println(response);
    }

    public static void callSendArchive(ArchiveManagerServiceGrpc.ArchiveManagerServiceBlockingStub stub,
                                       String name, ByteString contents) {
        SendArchiveRequest request = SendArchiveRequest.newBuilder().setName(name).setContents(contents).build();
        SendArchiveResponse response = stub.sendArchive(request);
        System.out.println(response);
    }

    public static void callPwd(ArchiveManagerServiceGrpc.ArchiveManagerServiceBlockingStub stub) {
        PwdRequest request = PwdRequest.newBuilder().build();
        PwdResponse response = stub.pwd(request);
        System.out.println(response);
    }

    public static void callChangeDirUp(ArchiveManagerServiceGrpc.ArchiveManagerServiceBlockingStub stub) {
        ChangeDirectoryUpRequest request = ChangeDirectoryUpRequest.newBuilder().build();
        ChangeDirectoryUpResponse response = stub.changeDirectoryUp(request);
        System.out.println(response);
    }

    public static void callChangeDirDown(ArchiveManagerServiceGrpc.ArchiveManagerServiceBlockingStub stub,
                                     String name) {
        ChangeDirectoryDownRequest request = ChangeDirectoryDownRequest.newBuilder().setName(name).build();
        ChangeDirectoryDownResponse response = stub.changeDirectoryDown(request);
        System.out.println(response);
    }

}
