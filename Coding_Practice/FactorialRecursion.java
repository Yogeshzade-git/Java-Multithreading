public class FactorialRecursion {
    public static void main(String[] args) {
        System.out.println("Factorial - " + fact(5));

        System.out.println("sumOfNaturalNum - " + sumOfNaturalNum(10) );
    }

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);     // 5 * 4!      4 * 3!  so on
    }

    public static int sumOfNaturalNum(int num) {
        if(num == 1){
            return 1;
        }
        return num + sumOfNaturalNum(num - 1);                               // 5 + 4 + 3 + 2 + 1    means 5 + 4 natural number   -->    5 + (5-1)
    }
}
