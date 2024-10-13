
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    
    int i=1;

    private final ExecutorService threadPool;

    //Constructor to intialize the threadPool size
    public ExecutorServiceExample(int poolSize){
        this.threadPool = Executors.newFixedThreadPool(poolSize);
    }

    // This method will be executed by the thread pool
    public void printMessage(){
        try{
            System.out.println( i + " Hello Yogesh");
            i++;
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {

        // Create a ExecutorServiceExample with a thread pool of size 10
        ExecutorServiceExample example = new ExecutorServiceExample(10);

        // Submit 100000 tasks to the thread pool
        for(int i=1; i<=100000; i++) {
            example.threadPool.execute(example::printMessage);
        }

        // Shut down the thread pool after the tasks are submitted
        example.threadPool.shutdown();
    }
}