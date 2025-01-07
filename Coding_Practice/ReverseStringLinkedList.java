import java.util.LinkedList;

public class ReverseStringLinkedList {

    public static void main(String[] args) {

        String str = "Hello";

        LinkedList<Character> linkedList = new LinkedList<>();

        for (char ch : str.toCharArray()){
            linkedList.addLast(ch);
        }

        for (int i=0; i<str.length(); i++){
            System.out.print(linkedList.removeLast());
        }

    }

}
