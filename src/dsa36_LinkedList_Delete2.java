class node8{
    int data;
    node8 next;
    node8(int x){
        data=x;
    }
}

public class dsa36_LinkedList_Delete2 {
    static node8 delTail(node8 head){
        if(head==null||head.next==null){
            return null;
        }
        node8 curr=head;
        while(curr.next.next!=null){
            curr=curr.next;}
            curr.next=null;

        return head;


    }
    public static void main(String[] args) {
        node8 head=new node8(10);
        node8 temp1=new node8(20);
        node8 temp2=new node8(30);
        node8 temp3=new node8(40);
        node8 temp4=new node8(50);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        temp3.next=temp4;
        node8 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;}
            node8 curr2=delTail(head);
        System.out.println();
        while(curr2!=null){
            System.out.print(curr2.data+" ");
            curr2=curr2.next;
        }



    }
}
