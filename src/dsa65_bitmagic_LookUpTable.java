

public class dsa65_bitmagic_LookUpTable {

    static int[] initialize(){
        int[] table1 =new int[256];
        table1[0]=0;
        for(int i=1;i<256;i++){
            table1[i]=(i&1)+table1[i/2];
        }
        return table1;
    }
       static int countSet(int n){
        int [] table1= initialize();
        int res=table1[n&0xff];/*0xff is basically 11111111*/
        n=n>>8;
        res=res+table1[n&0xff];
         n=n>>8;
         res=res+table1[n&0xff];
         n=n>>8;
         res=res+table1[n&0xff];
         return res;
    }
    public static void main(String[] args) {
        System.out.println(countSet(7));
        System.out.println(countSet(8));
    }
}
