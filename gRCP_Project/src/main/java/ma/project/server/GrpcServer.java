package ma.project.server;
import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import ma.project.services.BankGrpcService;
import java.io.IOException;


public class GrpcServer {
    public static void main(String[] args) throws IOException,
            InterruptedException {
// Création et configuration du serveur gRPC
        Server server = ServerBuilder.forPort(5555)
                .addService(new BankGrpcService())
                .build();
        System.out.println("Server started !!");
        server.start();
        server.awaitTermination();
    }
}
