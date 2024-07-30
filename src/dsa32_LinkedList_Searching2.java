class node4{
    int data;
    node4 next;
    node4(int x){
        data=x;
        next=null;
    }
}




public class dsa32_LinkedList_Searching2 {

    public static int outp(node4 head,int x){

        if(head==null){
            return -1;
        }
if(head.data==x){
    return 1;
}else{
    int res=outp(head.next,x);
        if(res==-1){
            return -1;
        }else{
            return (res+1);
        }
    }
}


    public static void main(String[] args) {
        node4 head=new node4(10);
        head.next=new node4(20);
        head.next.next=new node4(30);
        head.next.next.next=new node4(40);
        System.out.println( outp(head,10));


    }
}
