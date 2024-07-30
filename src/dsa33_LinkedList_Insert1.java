class node5{
    int data;
    node5 next;
    node5(int x){
        data=x;
        next=null;
    }
}


public class dsa33_LinkedList_Insert1 {
    static node5 insertBegin(node5 head,int x){
        node5 temp=new node5(x);
        temp.next=head;
        return temp;





    }

    public static void main(String[] args) {
        node5 head=null;
        head=insertBegin(head,30);
        head=insertBegin(head,20);
        head=insertBegin(head,10);
        node5 curr= head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }

        }




    }

