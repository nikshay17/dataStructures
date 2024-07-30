class Node3{
    int data;
    Node3 next;
    Node3 prev;
    Node3(int x){
        data=x;
    }
}


public class dsa46_DoublyLinkedList_CDLL {
    static Node3 insert(Node3 head,int x){
        Node3 temp=new Node3(x);
        if(head==null){
            temp.next=temp;
            temp.prev=temp;
            return temp;
        }
        temp.prev=head.prev;
        temp.next=head;
        head.prev.next=temp;
        head.prev=temp;
        return temp;


    }

    public static void main(String[] args) {

    }
}
