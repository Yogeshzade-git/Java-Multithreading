
class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class ReverseLinkedList {


    private static void addAtFirst(Node head) {
        Node newNode = new Node(5);
        newNode.next = head;
        head = newNode;

        printLL(head);
    }

    public static void middleElement(Node head){
        Node slowP = head;
        Node fastP = head;

        while(fastP != null && fastP.next != null){
            slowP = slowP.next;
            fastP = fastP.next.next;
        }

        System.out.println("Middle Element : " + slowP.value);
    }


    public static Node reverseLL(Node head) {
        // 10 -> 20 -> 30 -> 40 -> null

        Node curr = head, prev = null, temp;

        while (curr != null) {

            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }


    static void printLL(Node head) {

        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.value + " ");
            tempNode = tempNode.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);




        //print LL
        printLL(head);

        //middle element
        middleElement(head);

        //addFirstElement
        addAtFirst(head);

        //print reverse LL
        printLL(reverseLL(head));





    }


}
