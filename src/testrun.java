class tempnode{
    int data;
    tempnode next;
    tempnode(int x){
        data=x;
        next=null;

    }
}


public class testrun {

    static int search(tempnode head,int x){
        int pos=1;
        tempnode curr=head;
        while(curr!=null){
            if(curr.data==x){
                return pos;
            }
            else{
                pos++;
                curr=curr.next;
            }
        }return -1;



    }



        public static void main(String[] args) {
        tempnode head=new tempnode(20);
        head.next=new tempnode(40);
        head.next.next=new tempnode(60);
        head.next.next.next=new tempnode(80);

            System.out.println(search(head,60));


        }
    }
