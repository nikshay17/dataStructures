public class dsa21_Searching1_BinarySearch {
    static void swap(int a,int b,int arr[]){
        int temp=arr[a];
        if(arr[a]>arr[b]){
            arr[a]=arr[b];
            arr[b]=temp;}}
    static int[] sort(int arr[],int n){
        for(int i=0;i<n-1;i++){
           for(int j=0;j<n-i-1;j++){
               if(arr[j]>arr[j+1]){
                    swap(j,j+1,arr);

               }
            }

        }return arr;}
        static int binSearch(int arr[],int n,int search){
        sort(arr,n);




            int low = 0;
            int high = n - 1;
            int mid = (low + high) / 2;
            while (low <= high) {
                if (arr[mid] == search) {
                    return mid;
                } else if (arr[mid] > search) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            }
            return -1;






    }
    public static void main(String[] args) {
        int array[]={7,8,9,7,5,2};
        int n=array.length;
        System.out.println(binSearch(array,n,5));

    }
}
