import java.util.HashSet;

public class RemoveDuplicateFromString {
    public static void main(String[] args) {
        String string = "geeksforgeeks";

        StringBuilder sb = new StringBuilder(string.length());
        boolean seen[] = new boolean[26];

        for(int i=0; i< string.length(); i++){
            char ch = string.charAt(i);
            if(seen[ch - 'a'] == false){
                sb.append(ch);
                seen[ch - 'a'] = true;
            }
        }

        System.out.println(sb.toString());

        System.out.println("-----------------------------------------------------------");

        System.out.println(RDuplicate(string));

    }

    static public String RDuplicate(String string){

        HashSet<Character> hashSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : string.toCharArray()){
            if (!hashSet.contains(ch)){
                sb.append(ch);
                hashSet.add(ch);
            }
        }

        return sb.toString();
    }
}
