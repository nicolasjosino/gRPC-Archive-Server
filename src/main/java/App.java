import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8080).addService(new ArchiveManagerService()).build();

        server.start();

        logger.info("Server started on " + server.getPort());

        server.awaitTermination();
    }
}
