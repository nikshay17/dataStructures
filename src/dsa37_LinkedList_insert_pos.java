class node9{
    int data;
    node9 next;
    node9(int x){
        data=x;
        next=null;
    }
}

public class dsa37_LinkedList_insert_pos {
    static node9 insert(node9 head,int pos,int data){
        node9 temp=new node9(data);
        if(pos==1){
            temp.next=head;
            return head;
        }
        node9 curr=head;
        for(int i=1;i<=pos-2&&curr!=null;i++){
            curr=curr.next;


            }if(curr==null){
            return head;


        }temp.next=curr.next;
        curr.next=temp;




return head;
    }
    public static void main(String[] args) {
node9 head=new node9(75);
head.next=new node9(2);
head.next.next=new node9(4);
head.next.next.next=new node9(45);
insert(head,3,56);

        node9 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;}
    }
}
