public class dsa64_bitmagic3b_brianKerningamAlgorithm {
    static int countset(int n){
        int res=0;
        while(n>0){
            n=(n&(n-1));//removing the lastbit
            res++;
        }

return res;
    }
    public static void main(String[] args) {
        System.out.println(countset(7));

    }
}
