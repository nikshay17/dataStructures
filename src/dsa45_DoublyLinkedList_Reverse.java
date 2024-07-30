class Node2{
    int data;
    Node2 next;
    Node2 prev;
    Node2(int x){
        data=x;
    }
}

public class dsa45_DoublyLinkedList_Reverse {
    static Node2 reverse(Node2 head){
        if(head==null||head.next==null){
            return head;
        }
        Node2 prev=null;
        Node2 curr=head;
        while(curr!=null){
            prev=curr.prev;
            curr.prev=curr.next;
            curr.next=prev;
            curr=curr.next;
        }
        return prev;
    }



    public static void main(String[] args) {



    }
}
