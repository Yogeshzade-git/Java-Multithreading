import java.util.Arrays;
import java.util.HashMap;

public class AnagraString {
    public static void main(String[] args) {
        String str1 = "sairam";
        String str2 = "aismra";

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1, arr2));
    }

    static boolean areAnagrams(String s1, String s2) {

        // Create a hashmap to store character frequencies
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count frequency of each character in string s1
        for (char ch : s1.toCharArray())
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);

        // Count frequency of each character in string s2
        for (char ch : s2.toCharArray())
            charCount.put(ch, charCount.getOrDefault(ch, 0) - 1);

        // Check if all frequencies are zero
        for (var pair : charCount.entrySet()) {
            if (pair.getValue() != 0) {
                return false;
            }
        }

        // If all conditions satisfied, they are anagrams
        return true;
    }
}
