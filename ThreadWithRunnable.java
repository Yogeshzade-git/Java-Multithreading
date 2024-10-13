import static java.lang.Thread.sleep;

public class ThreadWithRunnable implements Runnable{

    public  void run(){
        for(int i=0; i<10; i++){
            System.out.println(i + " - Runnable Thread running!!");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        // creating runnable object
        ThreadWithRunnable t1 = new ThreadWithRunnable();
        Thread thread = new Thread(t1);

        //creating thread class object
        ThreadWithThreadClass thrdWT = new ThreadWithThreadClass();

        thread.start();
        thrdWT.start();
    }
}