public class FibonnaciRecursiion {
    public static void main(String[] args) {
        System.out.println("Fibonnaci series  :- " + fib(8));

        for(int i=0; i<=8; i++){
            System.out.println("Fibonacci for " + i + " is - " + fib(i));
        }

    }

    private static int fib(int n) {
        if (n <=1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

}
