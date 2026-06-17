package Linked_List;

class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}

public class ListNodeClass {
    // public static void print(Node head){
    //     Node temp = head;
    //     while(temp!=null){
    //         System.out.println(temp.val);
    //         temp = temp.next;
    //     }
    // }
    public static void displayRecursive(Node head){
        if(head==null) return;
        displayRecursive(head.next);
        System.out.println(head.val);
    }
    public static void main(String[] args) {
        Node a = new Node(10); // First node is always called a head node
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;  // linking a->b
        b.next = c;  // linking a->b->c
        c.next = d;
        d.next = e;  // linking a->b->c->d
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(d);
        // System.out.println(e);
        // System.out.println(a.val);
        // System.out.println(a.next.val);
        // System.out.println(a.next.next.val);
        // System.out.println(d.val);
        // System.out.println(e.val);
        // System.out.println(a.next);
        // System.out.println(b.next);
        // System.out.println(c.next);
        // System.out.println(d.next);
        // System.out.println(e.next);
        displayRecursive(a);
    }
}
