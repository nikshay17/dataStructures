
public class dsa22_Searching2_rbs {
    static int recursivesearch(int arr[],int low,int high,int x){

        if(low>high){
            return -1;
        }
        int mid = (low + high)/2;
        if (x>arr[mid]){

            return recursivesearch(arr,mid+1,high,x);
        }else if(x==arr[mid]){
            return mid;
        }
        else{
           return recursivesearch(arr,low,mid - 1,x);
        }

    }
    public static void main(String[] args) {
int array[]={5,8,9,6,75,56};
int low=0;
int high=array.length-1;
System.out.println(recursivesearch(array,low,high,55));

    }
}
