import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class FileUploadTask implements Runnable {
    private final String fileName;

    public FileUploadTask(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try {
            System.out.println("Starting upload of: " + fileName);
            // Simulating file upload time by sleeping for a few seconds
            long uploadTime = (long) (Math.random() * 10) + 1;  // Random time between 1 to 10 seconds
            TimeUnit.SECONDS.sleep(uploadTime);
            System.out.println("Finished uploading: " + fileName + " (Upload Time: " + uploadTime + " seconds)");
        } catch (InterruptedException e) {
            System.err.println("Upload interrupted for file: " + fileName);
        }
    }
}

public class FileUploadServer {
    // ThreadPool with a fixed number of threads
    private final ExecutorService threadPool;

    public FileUploadServer(int numberOfThreads) {
        // Create a thread pool with the given number of threads
        this.threadPool = Executors.newFixedThreadPool(numberOfThreads);
    }

    public void submitFileUpload(String fileName) {
        // Submit a file upload task to the thread pool
        threadPool.submit(new FileUploadTask(fileName));
    }

    public void shutdownServer() {
        // Shutdown the thread pool after all tasks have been submitted
        threadPool.shutdown();
        try {
            if (!threadPool.awaitTermination(60, TimeUnit.SECONDS)) {
                threadPool.shutdownNow(); // Force shutdown if tasks don't finish in time
            }
        } catch (InterruptedException e) {
            threadPool.shutdownNow();
        }
        System.out.println("File Upload Server shutdown.");
    }

    public static void main(String[] args) {
        // Create a server with a thread pool of 3 threads (allowing 3 uploads at a time)
        FileUploadServer server = new FileUploadServer(3);

        // Simulate multiple file uploads
        String[] filesToUpload = {"file1.txt", "file2.txt", "file3.txt", "file4.txt", "file5.txt"};

        for (String fileName : filesToUpload) {
            server.submitFileUpload(fileName);
        }

        // Shut down the server once all tasks are submitted
        server.shutdownServer();
    }
}
