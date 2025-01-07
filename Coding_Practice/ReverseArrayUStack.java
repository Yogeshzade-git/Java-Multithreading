import java.util.Stack;

public class ReverseArrayUStack {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40};

        Stack<Integer> stack = new Stack<>();

        for (int n : arr) {
            stack.push(n);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(stack.pop() + " ");
        }
    }
}
