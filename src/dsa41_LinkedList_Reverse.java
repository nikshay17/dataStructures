class node13{
    int data;
    node13 next;

    node13(int x){
        data=x;
    }
}



public class dsa41_LinkedList_Reverse {

    static node13 reverse(node13 head){
        node13 curr=head;
        node13 prev=null;
        while(curr!=null){
            node13 next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void main(String[] args) {
        node13 head=new node13(10);
        head.next=new node13(20);
        head.next.next=new node13(40);
        head.next.next.next=new node13(460);


        node13 curr=reverse(head);
        while(curr!=null) {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }




        }

    }

