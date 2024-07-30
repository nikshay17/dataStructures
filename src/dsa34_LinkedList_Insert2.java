class node6{
    int data;
    node6 next;
    node6(int x){
        data=x;
        next=null;
    }
}


public class dsa34_LinkedList_Insert2{
    static node6 insertEnd(node6 head,int x){
        node6 temp=new node6(x);
        if(head==null){
            return temp;
        }
        node6 curr=head;
        while(curr.next!=null) {
            curr = curr.next;}
            curr.next = temp;


        return head;




    }


    public static void main(String[] args) {
        node6 head=null;
        head=insertEnd(head,30);
        head=insertEnd(head,20);
        head=insertEnd(head,10);
        node6 curr=head;
        while(curr!=null) {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }


    }




}

