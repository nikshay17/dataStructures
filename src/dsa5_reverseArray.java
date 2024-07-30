public class dsa5_reverseArray {
    static int[] reverse(int arr[]){
        int n=arr.length;
        int high=n-1;
        int low=0;
        while(low<high){
            int t=arr[low];
            arr[low]=arr[high];
            arr[high]=t;
            low++;
            high--;
        }return arr;

    }


    public static void main(String[] args) {
        int array[]={4,8,9,7,8,6};
        for(int i:reverse(array)){
            System.out.print(i+",");
        }

    }
}