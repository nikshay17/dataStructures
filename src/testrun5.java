public class testrun5 {
    public static void main(String[] args) {
        int arr[]={5,8,9,12,67,204};
        int n=arr.length;


        int min=0;
        int max=n-1;

        int div=arr[max]+1;

        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i]+=(arr[max]%div)*div;
                max--;
            }
            if(i%2!=0){
                arr[i]+=(arr[min]%div)*div;
                min++;
            }






    }


        for(int i=0;i<n;i++){
            arr[i]=arr[i]/div;
        }

        for(int i:arr){
            System.out.println(i);
        }
}
}