public class dsa3_secondlargest {

      static   int ar(int arr[]){
            int res=-1;
            int largest=0;
            for(int i=1;i<arr.length;i++){
                if(arr[i]>arr[largest]){
                    res=largest;
                    largest=i;


                }else if(arr[i]!=arr[largest]){
                    if(res==-1||arr[i]>arr[res]){
                        res=-1;

                    }

                }
            }return res;
        }


    public static void main(String[] args) {
            int arr[]={4,7,6,8};
        System.out.println(ar(arr));

    }
}
