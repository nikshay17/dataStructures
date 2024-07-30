public class dsa67_bitmagic67_xorpart2 {
    static void findA(int array[],int n){
        int xor=0;
        int res1=0;
        int res2=0;

        for(int i=0;i<n;i++){
            xor=xor^array[i];


        }
        int rm=xor&~(xor-1);
        for(int i=0;i<n;i++){
            if((array[i]&rm)!=0){
                res1=res1^array[i];
            }
            else{
                res2=res2^array[i];
            }

        }
        System.out.println(res1+" "+res2);

    }
    public static void main(String[] args) {
        int array[]={1,2,2,3,4,5,4,6,6,5};
        findA(array,10);




    }
}
