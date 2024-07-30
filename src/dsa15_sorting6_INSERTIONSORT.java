public class dsa15_sorting6_INSERTIONSORT {
    static void insertionsort(int arr[],int n){
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }

    }
    public static void main(String[] args) {
        int array[]={8,7,9,6,5};
        int n=array.length;
        insertionsort(array,n);
        for (int i:array
             ) {
            System.out.print(i+" ");

        }


    }
}



