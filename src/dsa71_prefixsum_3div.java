import java.util.HashMap;
import java.util.Map;

public class dsa71_prefixsum_3div {
    public static boolean checksum(int [] arr,int n){
        int l[]=new int[n];
        int r[]=new int[n];
        l[0]=0;
        r[n+1]=0;
        for(int i=1;i<n;i++){
            l[i]=arr[i-1]+l[i-1];
        }
        for(int i=n-2;i>=0;i--){
            r[i]=r[i+1]+arr[i+1];
        }
        return true;

    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,1,2,5,1,1};
        int n=array.length;
        System.out.println(checksum(array,n));

    }
}
