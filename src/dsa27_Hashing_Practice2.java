import java.util.HashMap;
import java.util.Map;

public class dsa27_Hashing_Practice2 {
    static void freq(int arr[],int n){
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(m.containsKey(arr[i])){
                m.put(arr[i],m.get(arr[i])+1);
            }
            else{
                m.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer>e:m.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }

    public static void main(String[] args) {
        int arr[]={5,7,8,9,4,5,6,7,7,8,9};
        int n=arr.length;
        freq(arr,n);
    }
}
