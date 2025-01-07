import java.util.Stack;

public class ValidParanthesisStack {
    public static void main(String[] args) {


//        String str = "{[}{]}";

        String str = "[{()}]";

        System.out.println(isValidParanthese(str));
    }

    public static boolean isValidParanthese(String str){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                stack.push(str.charAt(i));
            } else {

                if (!stack.empty() &&
                                ((stack.peek() == '(' && str.charAt(i) == ')') ||
                                (stack.peek() == '[' && str.charAt(i) == ']') ||
                                (stack.peek() == '{' && str.charAt(i) == '}') ))
                {
                    stack.pop();
                }else{
                    return false;
                }


            }

        }

        return stack.isEmpty();
    }
}
