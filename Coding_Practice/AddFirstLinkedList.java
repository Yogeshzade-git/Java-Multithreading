//
//class Node{
//    int value;
//    Node next;
//
//    public Node(int value){
//        this.value = value;
//        this.next=null;
//    }
//}
//public class AddFirstLinkedList {
//    public static void main(String[] args) {
//
//        //Creating linkedlist 10 -> 20
//        Node head = new Node(10);
//        head.next = new Node(20);
//        head.next.next = new Node(30);
//        head.next.next.next = new Node(40);
//        head.next.next.next.next = new Node(50);
//
//        // add 5 at start   5-> 10 -> 20
//        Node startNode = new Node(5);
//        startNode.next = head;
//        head = startNode;
//
//
//        //traverse linkedlist
//        Node tempNode = head;
//        while(tempNode!=null){
//            System.out.print(tempNode.value + " ");
//            tempNode = tempNode.next;
//        }
//
//        System.out.println();
//
//        Node slowPointer = head;
//        Node fastpointer = head;
//        while(fastpointer!=null){
//            slowPointer = slowPointer.next;
//            fastpointer = fastpointer.next.next;
//        }
//
//        System.out.println("Middle element of linkedList is : " + slowPointer.value);
//
//;
//    }
//}
