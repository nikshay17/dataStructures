class node3{
    int data;
    node3 next;
    node3(int x){
        data=x;
        next=null;

    }

}

    public class dsa31_LinkedList_Searching1{
    public static int searching1(node3 head,int x){

        int pos=1;
        node3 curr=head;
        while(curr!=null){
            if(curr.data==x){
                return pos;



            }
            else{
                pos++;
                curr=curr.next;
            }
        }
        return -1;
    }

        public static void main(String[] args) {
            node3 head=new node3(10);
            head.next=new node3(20);
            head.next.next=new node3(30);
            head.next.next.next=new node3(40);
            System.out.println(searching1(head,30));
        }
    }