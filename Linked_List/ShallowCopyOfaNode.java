package Linked_List;

// class Node{
//     String 
// }

public class ShallowCopyOfaNode {
    public static void main(String[] args) {
        // Node temp = a;
        Node a = new Node(10);
        System.out.println(a.val);
        Node temp = a; // Shallow copy
        System.out.println(temp.val);
    }
}
