import java.util.ArrayList;

public class dsa70_prefixsum_maxindinrange {
    public static int maxocc(int left[],int right[],int n){
        int [] arr=new int[10];
        for(int i=0;i<n;i++){
            arr[left[i]]++;
            arr[right[i]+1]--;

        }
        int max=arr[0];
        int res=0;

        for(int i=1;i<10;i++){
            arr[i]+=arr[i-1];
            if(arr[i]>max){
                max=arr[i];
                res=i;

            }
        }
        return res;


    }
    public static void main(String [] args) {

        int []left={1,2,3};
        int []right={3,5,7};
        int n=3 ;
        System.out.println(maxocc(left,right,n));



    }
}
