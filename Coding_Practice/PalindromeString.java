public class PalindromeString {
    public static void main(String[] args) {
        String str = "Too hot to hoot.";
        str = str.toLowerCase().replaceAll("[^A-Za-z0-9]", "");

        System.out.println(str);

        int left = 0;
        int right = str.length() - 1;
        boolean res = true;

        while (left <= right) {
            if (str.charAt(left) != str.charAt(right)) {
                res = false;
                break;
            } else {
                left++;
                right--;
            }
        }
        System.out.println("Is Palindrome:- " + res);
    }
}
