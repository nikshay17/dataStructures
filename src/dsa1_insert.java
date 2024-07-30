class insertArray{
    public int []insert1(int []arr,int n,int x,int indx) {
        int arr2[] = new int[n + 1];
        for (int i =n-1; i >=0; i--) {
            arr2[i] = arr[i];

        }
        for (int i = n-1; i > indx; i--) {
            arr2[i+1] = arr2[i];
            arr2[indx] = x;
        }

return arr2;

    }
}


public class dsa1_insert {
    public static void main(String[] args) {
        int array[]={4,5,6,7};
        int length=array.length;
        int input=13;
        int index=2;
        insertArray nik=new insertArray();
       int array2[]= nik.insert1(array,length,input,index);
       for(int i:array2){
           System.out.print(i+" ");
       }


    }
}