
public class dsa14_sorting5_SELECTIONSORT {
    static void swap(int a, int b, int arr[]) {
        int temp = arr[a];
        if (arr[a] > arr[b]) {
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }

    static void selectSort(int arr[], int n) {
        int minindex;
        for (int i = 0; i < n-1; i++) {
            minindex = i;
            for (int j = i + 1; j < n; j++) {
                if(arr[j]<arr[minindex]){
                    minindex=j;
                    swap(i,minindex,arr);

                }

            }
        }
    }
        public static void main (String[]args){
        int array[]={5,6,3,8,2,1,90};
        int n=array.length;
            selectSort(array,n);
            for(int i:array){
                System.out.print(i+" ");
            }

        }
    }
