import java.sql.SQLOutput;

public class AddDigits {

    //TRICKY Question       Rule of divisibility of 9
    public static void main(String[] args) {
        int num = 5674;  // 1+2+3+4 = 10 = 1+0 = 1
        System.out.println(addDigits(num));
    }

    public static int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 9 == 0 ? 9 : num % 9;
    }
}
