class node1{
    int data;
    node1 next;// self referencial structure
    node1(int x){
        data=x;
        next=null;
    }
}




public class dsa29_LinkedList_Traversing {
    public static void printlist(node1 head){
        node1 curr=head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        node1 head=new node1(10);
        head.next=new node1(20);
        head.next.next=new node1(30);
        head.next.next.next=new node1(40);
        printlist(head);



    }
}
