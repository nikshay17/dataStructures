class node15{
    int data;
    node15 next;
    node15(int x){
        data=x;
    }

}

public class dsa43_LinkedlList_RemovingDuplicates {
    static void RemoveDup(node15 head){
        node15 curr=head;
        while(curr!=null&&curr.next!=null){
            if(curr.data==curr.next.data){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }
        }
    }
    public static void main(String[] args) {
        node15 head=new node15(10);
        head.next=new node15(10);
        head.next.next=new node15(40);
        head.next.next.next=new node15(460);

    RemoveDup(head);
        node15 curr=head;



        while(curr!=null) {
            System.out.print(curr.data+" ");
            curr=curr.next;

    }
}}
