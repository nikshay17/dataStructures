class node14{
    int data;
    node14 next;
    node14(int x){
        data=x;
    }
}

public class dsa42_LinkedList_recursivereverse {
    static node14 reverse(node14 curr,node14 prev){
        if(curr==null){
            return prev;
        }

        node14 next=curr.next;
        curr.next=prev;
        return reverse(next,curr);





    }

       /* if(head==null||head.next==null) {
            return head;
        }
        node14 resthead=reverse(head.next);
        node14 resttail=head.next;
        resttail.next=head;
        head.next=null;
        return resthead;

    }*/


    public static void main(String[] args) {
        node14 head=new node14(10);
        head.next=new node14(20);
        head.next.next=new node14(40);
        head.next.next.next=new node14(460);



        node14 curr=reverse(head,null);
        while(curr!=null) {
            System.out.print(curr.data+" ");
            curr=curr.next;




    }
}}
