public class PrintCharInDescendingOrderOfFrequency {
    public static void main(String[] args) {
        String str = "geeksforgeeks";

        int freq[] = new int[26];

        for(char ch : str.toCharArray()){
            freq[ch-'a']++;
        }

    }
}
