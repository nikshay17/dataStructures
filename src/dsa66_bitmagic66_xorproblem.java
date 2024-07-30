public class dsa66_bitmagic66_xorproblem {
    static int find(int arr[],int n){
        int res=0;
        for(int i=0;i<n;i++){
            res=res^arr[i];
        }
        return res;


    }
    public static void main(String[] args) {
        int arr[]={3,4,3,5,5};
        System.out.println(find(arr,arr.length));
    }
}
