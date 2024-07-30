class node2{
    int data;
    node2 next;
    node2(int x){
        data=x;
        next=null;
    }
}




public class dsa30_LinkedList_RecursiveDisplay {
    public static void printlist(node2 head){
        if(head==null){
            return;
        }
        System.out.println(head.data+" ");
        printlist(head.next);
    }
    public static void main(String[] args) {
        node2 head=new node2(10);
        head.next=new node2(20);
        head.next.next=new node2(30);
        head.next.next.next=new node2(40);
        printlist(head);



    }
}
