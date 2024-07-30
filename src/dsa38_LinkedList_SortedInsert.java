class node10{
    int data;
    node10 next;
    node10(int x){
        data=x;
    }
}



public class dsa38_LinkedList_SortedInsert {
    static node10 insert(node10 head,int data){
        node10 temp=new node10(data);
        if(head==null){
            return temp;
        }
        if(data<head.data){
            temp.next=head;
            return temp;
        }
        node10 curr=head;
        while(curr.next!=null&&curr.next.data<data){
            curr=curr.next;
        }temp.next=curr.next;
        curr.next=temp;
        return head;




    }
    public static void main(String[] args) {
        node10 head=new node10(10);
        head.next=new node10(12);
        head.next.next=new node10(98);
        head.next.next.next=new node10(104);
        insert(head,56);

        node10 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;}
    }

    }

