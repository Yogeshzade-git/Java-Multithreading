
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server{

    private final ExecutorService threadPool;

    public Server(int poolSize){
        this.threadPool = Executors.newFixedThreadPool(poolSize);  //intialize threadPool size
    }

    public void handleClient(Socket clientSocket){
        try(PrintWriter toClient = new PrintWriter(clientSocket.getOutputStream(), true)){
            toClient.println("Hello from Server" + clientSocket.getInetAddress());
        }catch(IOException e){
            e.getStackTrace();
        }
    }

    public static void main(String[] args) {
        int port = 8084; //server will listen on this port
        int threadPoolSize = 10;  //initialize thread pool size
        Server server = new Server(threadPoolSize);

        try(ServerSocket serverSocket = new ServerSocket(port)){
            serverSocket.setSoTimeout(10000);  
            System.out.println("Server is listening at port:8084");
            
            while(true){
                Socket clienSocket = serverSocket.accept();
                
                server.threadPool.execute(() -> server.handleClient(clienSocket));  //submitting task to threads
            }

        }catch(IOException ie){
            ie.getStackTrace();
        }finally{
            server.threadPool.shutdown(); //shutdown threadpool
        }
    }
}