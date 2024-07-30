import java.util.*;
public class dsa4_PushingTheZeroes {
    static void swap(int i,int j,int array[]){
        int t=array[i];
        array[i]=array[j];
        array[j]=t;
    }
    static int [] dsa4(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                swap(i,count,arr);
                count++;
            }
        }return arr;
    }
    public static void main(String[] args) {
        int array[]={3,4,6,4,0,6,0,4,0,2};
        for(int i:dsa4(array)){
            System.out.print(i+",");
        }

    }
}
