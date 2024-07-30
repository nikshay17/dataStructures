import java.util.HashSet;

public class dsa26_Hashing_Practice1 {
   static int countdis(int arr[],int n){
        HashSet<Integer>h=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            h.add(arr[i]);
        }
        return h.size();
    }
    public static void main(String[] args) {
        int array[]={5,9,8,5,6,9,9,8,3};
        int n=array.length;
        System.out.println(countdis(array,n));
    }
}
