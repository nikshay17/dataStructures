class node7{
    int data;
    node7 next;
    node7(int x){
        data=x;
        next=null;
    }
}
public class   dsa35_LinkedList_Delete1 {
    static node7 delHead(node7 head){
        if(head==null){
            return null;
        }
        return head.next;
    }
    public static void main(String[] args) {
        node7 head=new node7(10);
        node7 temp1=new node7(20);
        node7 temp2=new node7(30);
        node7 temp3=new node7(40);
        node7 temp4=new node7(50);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        temp3.next=temp4;
        node7 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;}
        node7 curr2=delHead(head);
        System.out.println();
        while(curr2!=null){
            System.out.print(curr2.data+" ");
            curr2=curr2.next;
        }
    }
}
