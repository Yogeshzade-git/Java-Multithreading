public class ThreadWithThreadClass extends Thread{
    public void run(){
        for (int i = 10; i > 0; i--) {
            System.out.println(i + " - Thread class thread running!!");

            try{
                sleep(1000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
