class node12{
    int data;
    node12 next;
    node12(int x){
        data=x;
    }
}


public class dsa40_LinkedList_nthnodefromend {
    static void nth(node12 head,int n){
        if(head==null){
            return ;}
        node12 first=head;
        for(int i=0;i<n;i++) {
            if (first == null) {
                return;
            }
            first = first.next;


        }

        node12 second=head;
         while(first!=null){
             second=second.next;
             first=first.next;
             }


        System.out.println(second.data);
       /* int count=1;
        node12 curr=head;
        node12 temp=curr;
        while(curr!=null){
            count++;
            curr=curr.next;

        }
        for(int i=1;i<count;i++){
            if(n>count){
                return ;
            }
            if(i==count-n){
                System.out.println(temp.data);




            }
            else{
                temp=temp.next;
            }
*/
        }






    public static void main(String[] args) {
        node12 head=new node12(10);
        node12 temp1=new node12(20);
        node12 temp2=new node12(30);
        node12 temp3=new node12(40);

        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;

        nth(head,1);

    }
}
