class node11{
    int data;
    node11 next;
    node11(int x){
        data=x;
    }
}

public class important_dsa39_LinkedList_Middle {
    static void middle(node11 head){
        if(head==null){
            return;
        }
        node11 slow=head;
        node11 fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        System.out.println(slow.data);



    }
    public static void main(String[] args) {
        node11 head=new node11(75);
        head.next=new node11(2);
        head.next.next=new node11(7);
        head.next.next.next=new node11(45);
        head.next.next.next.next=new node11(80);
        middle(head);



    }

    }

