class nodel{
    int data;
    nodel next;
    nodel(int x){
        data=x;
        next=null;
    }



}


public class testrun2 {
    static nodel deletebegin(nodel head){
        if(head==null||head.next==null){
            return null;
        }
        nodel curr=head;
        while(curr.next.next!=null){
            curr=curr.next;

        }curr.next=null;
        return head;
    }



    public static void main(String[] args) {
        nodel head=new nodel(50);
        nodel temp1=new nodel(60);
        nodel temp2=new nodel(70);
        nodel temp3=new nodel(80);
        nodel temp4=new nodel(80);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        temp3.next=temp4;
        nodel curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;


        }
        System.out.println();
nodel curr2=deletebegin(head);
        while(curr2!=null){

            System.out.print(curr2.data+" ");
            curr2=curr2.next;



    }
}}
