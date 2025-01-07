import java.util.ArrayList;
import java.util.Arrays;

public class NumberOfVowelInString {
    public static void main(String[] args) {
        String str = "asd iefg oxc ug";
        str = str.toLowerCase().replaceAll("[^A-Za_z0-9]]","");

        ArrayList<Character> arrayList = new ArrayList<>(Arrays.asList('a','e','i', 'o','u'));

        int count = 0;

        for(int i=0; i<str.length(); i++){
            if(arrayList.contains(str.charAt(i))){
                count++;
            }
        }

        System.out.println("No. of Vowel are - " + count);
        System.out.println("consonants are - " + (str.length()-count));
    }
}
