package Linked_List;
class doublyNode{
    int val;
    doublyNode next;
    doublyNode prev;
    doublyNode(int val){
        this.val = val;
    }
}
class DLL{
    doublyNode head;
    doublyNode tail;
    int size;
    void display(){
        doublyNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void insertAtTail(int val){
        doublyNode temp = new doublyNode(val);
        if(size==0) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    void insertAthead(int val){
        doublyNode temp = new doublyNode(val);
        if(size==0) head = tail = temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
}
public class DoublyLinkedListImplementation {
    public static void print(doublyNode head){
        doublyNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void printprev(doublyNode tail){
        doublyNode temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
    }
    public static void display(doublyNode node){
        doublyNode temp = node;
        while(temp.prev!=null){
            temp = temp.prev;
        }
        // temp is at head
        print(temp);
    }
    public static void main(String[] args) {
        doublyNode a = new doublyNode(10);
        doublyNode b = new doublyNode(20);
        doublyNode c = new doublyNode(30);
        doublyNode d = new doublyNode(40);
        a.next = b; b.prev = a;
        b.next = c; c.prev = b;
        c.next = d; d.prev = c;
        print(a);
        printprev(d);
        DLL list = new DLL();
        list.display();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display();
        list.insertAtTail(40);
        list.display();
        list.insertAthead(50);
        list.display();
        
    }
}
