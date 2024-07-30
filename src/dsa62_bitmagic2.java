public class dsa62_bitmagic2 {
    static void kthbit(int n,int k){
//        if((n&(1<<k-1))!=0){
//            System.out.println("yes");
//
//        }else{
//            System.out.println("no");
//        }


        if((n>>(k-1)&1)!=0){
            System.out.println("yes");

        }
        else{
            System.out.println("no");
        }

    }
    public static void main(String[] args) {
        kthbit(5,3);

    }
}
