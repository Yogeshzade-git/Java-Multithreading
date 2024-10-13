import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    private final ExecutorService threadPool;

    public Server(int poolSize) {
        this.threadPool = Executors.newFixedThreadPool(poolSize); // Initialize thread pool size
    }

    public void handleClient(Socket clientSocket) {
        try (PrintWriter toClient = new PrintWriter(clientSocket.getOutputStream(), true)) {
            // Read the HTML file
            String htmlContent = readHtmlFile("index.html");
            
            // Send HTTP response headers
            toClient.println("HTTP/1.1 200 OK");
            toClient.println("Content-Type: text/html");
            toClient.println("Content-Length: " + htmlContent.length());
            toClient.println(); // End of headers

            // Send the HTML content
            toClient.println(htmlContent);
        } catch (IOException e) {
            System.err.println("Error handling client: " + e.getMessage());
            e.printStackTrace(); // Log the exception stack trace
        } finally {
            try {
                clientSocket.close(); // Ensure the client socket is closed
            } catch (IOException e) {
                System.err.println("Error closing client socket: " + e.getMessage());
            }
        }
    }

    private String readHtmlFile(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                contentBuilder.append(line);
                contentBuilder.append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.err.println("Error reading HTML file: " + e.getMessage());
            e.printStackTrace(); // Log the exception stack trace
        }
        return contentBuilder.toString();
    }

    public static void main(String[] args) {
        int port = 8084; // Server will listen on this port
        int threadPoolSize = 10; // Initialize thread pool size
        Server server = new Server(threadPoolSize);

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            serverSocket.setSoTimeout(100000);
            System.out.println("Server is listening at port: " + port);
            
            while (true) {
                try {
                    Socket clientSocket = serverSocket.accept();
                    server.threadPool.execute(() -> server.handleClient(clientSocket)); // Submitting task to threads
                } catch (IOException e) {
                    System.err.println("Accept failed: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            System.err.println("Error starting server: " + e.getMessage());
            e.printStackTrace();
        } finally {
            server.threadPool.shutdown(); // Shutdown thread pool
        }
    }
}
