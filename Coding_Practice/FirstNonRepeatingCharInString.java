public class FirstNonRepeatingCharInString {
    public static void main(String[] args) {
        String str = "geeksforgeeks";

        int freq[] = new int[26];
        char carr[] = str.toCharArray();

        for (char ch : carr){
            freq[ch - 'a']++;
        }

        for (char ch : carr){
            if(freq[ch - 'a'] == 1){
                System.out.println(ch);
                break;
            }
        }
    }
}
