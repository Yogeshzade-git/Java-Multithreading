import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;

public class RemoveCharFromFirstStringPInSecondString {
    public static void main(String[] args) {
        String str1 = "computer";
        String str2 = "cat";


        ArrayList<Character> arrayList = new ArrayList<>();
        ArrayList<Character> newArrayList = new ArrayList<>();

        for (char ch : str1.toCharArray()){
            arrayList.add(ch);
        }

        for (char newCh : str2.toCharArray()){
            newArrayList.add(newCh);
        }

        arrayList.removeAll(newArrayList);
        System.out.println(arrayList);

    }
}
