class Node1{
    int data;
    Node1 prev;
    Node1 next;
    Node1(int x){
        data=x;
        next=prev=null;
    }
}

public class dsa44_DoublyLinkedList_Insert {
    public static Node1 insertbegin(Node1 head,int data){
        Node1 temp=new Node1(data);
        temp.next=head;
        if(head!=null){
            head.prev=temp;
        }
        return temp;


    }
    public static Node1 insertEnd(Node1 head,int data){
        Node1 temp=new Node1(data);
        if(head==null){
            return temp;
        }
        Node1 curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
        temp.next=null;
        temp.prev=curr;
        return head;
    }
    public static void main(String[] args) {

    }
}
