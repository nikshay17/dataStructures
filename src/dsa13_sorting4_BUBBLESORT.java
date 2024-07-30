


public class dsa13_sorting4_BUBBLESORT {
    static void swap(int a,int b,int arr[]){
        int temp=arr[a];
        if(arr[a]>arr[b]){
            arr[a]=arr[b];
            arr[b]=temp;



        }}
    static void bubblesort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(j,j+1,arr);
                }
            }
        }}

    public static void main(String[] args) {
        int array[]={4,3,68,87,45};
        int n=array.length;
        bubblesort(array,n);
        for(int i:array){
            System.out.print(i+" ");

        }



        }

    }

