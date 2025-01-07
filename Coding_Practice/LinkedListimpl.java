//
//
//class Node {
//    int value;
//    Node next;
//
//    public Node(int value){
//        this.value = value;
//        this.next = null;
//    }
//}
//public class LinkedListimpl {
//    public static void main(String[] args) {
//
//        Node head = new Node(10);
//        head.next = new Node(20);
//        head.next.next = new Node(30);
//
//        // Adding ele at first in linked list
//        Node newNode = new Node(5);
//        newNode.next = head;
//        head = newNode;
//
//        //Adding ele at last of linked list
//        Node newLastNode = new Node(40);
//        head.next.next.next.next = newLastNode;
//
//
//        //Traversing the linked list
//        Node tempNode = head;
//        while(tempNode!=null){
//            System.out.print(tempNode.value + " ");
//            tempNode = tempNode.next;
//        }
//
//    }
//}
