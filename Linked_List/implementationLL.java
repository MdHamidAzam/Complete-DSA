package Linked_List;
class SLL{  // user defined data structure
    private Node head;
    Node tail;
    private int size;
    void InsertAtTail(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void InsertAtHead(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void Insert(int indx, int val){
        Node temp = new Node(val);
        if(indx==0){
            InsertAtHead(val);
            return;
        }
        if(indx==size){
            InsertAtTail(val);
            return;
        }
        if(indx>size || indx<0){
            System.out.println("Invalid index");
            return;
        }
        Node x = head;
        for(int i=1;i<=indx-1;i++){
            x = x.next;
        }
        // Insertion
        temp.next = x.next;
        x.next = temp;
        size++;
    }
    int get(int indx)throws Error{
        if(indx==size-1) return tail.val;
        if(indx>=size || indx<0){
            throw new Error("Invalid index");
            // return -1;
        }
        Node temp = head;
        for(int i=1;i<=indx;i++){
            temp = temp.next;
        }
        return temp.val;
    }
    void set(int indx, int val) throws Error{
        if(indx==size-1){
            tail.val = val;
        }
        if(indx>=size || indx<0){
            throw new Error("Invalid index");
        }
        Node temp = head;
        for(int i=1;i<=indx;i++){
            temp = temp.next;
        }
        temp.val = val;
    }
    void deleteAthead() throws Error{
        if(head==null) throw new Error("list is Empty");
        head = head.next;
        size--;
    }
    void deleteIndex(int indx) throws Error{
        if(indx==0){
            deleteAthead();
            return;
        }
        if(indx<0 || indx>=size) throw new Error("Invalid index");
        Node temp = head;
        for(int i=1;i<=indx-1;i++){
            temp = temp.next;
        }
        if(temp.next==tail) tail = temp;
        temp.next = temp.next.next;
        size--;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println("Size is: "+size);
    }
}
public class implementationLL {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.size();
        list.InsertAtTail(20);
        list.InsertAtTail(25);
        list.size();
        list.display();
        list.InsertAtTail(30);
        list.InsertAtTail(35);
        list.size();
        list.display();
        list.InsertAtHead(15);
        list.InsertAtHead(10);
        list.size();
        list.display();
        list.Insert(3,22);
        list.display();
        list.Insert(9,100);
        list.display();
        System.out.println(list.get(5));
        // System.out.println(list.get(-1));
        list.display();
        list.set(2,300);
        list.display();
        list.deleteAthead();
        list.display();
        list.size();
        list.deleteIndex(3);
        list.display();
        list.size();
        list.deleteIndex(4);
        list.display();
        list.size();
        System.out.println(list.tail.val);
    }
}
