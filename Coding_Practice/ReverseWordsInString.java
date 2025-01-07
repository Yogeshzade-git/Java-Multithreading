import java.util.Arrays;
import java.util.Stack;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = " Hello yogesh how are you ";

        String words[] = str.split(" +");

        StringBuilder sb = new StringBuilder();

        for(int i=words.length-1; i>=0; i--){
            sb.append(words[i]);
            sb.append(" ");
        }

        System.out.println(sb.toString().trim());


    }


}
