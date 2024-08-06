

public class dsa79_backtracking1 {
    public static String swap(String s,int a,int b){
       char[] array=s.toCharArray();
       char temp=array[a];
       array[a]=array[b];
       array[b]=temp;
       return new String(array);


    }

    public static void permute(String s,int l,int r) {
        if(l==r){

            System.out.print(s+" ");
        }
        else{
            for(int i=l;i<=r;i++){
               s= swap(s,l,i);
                permute(s,l+1,r);
               s= swap(s,l,i);
            }
        }
    }
    public static void main(String[] args) {
        String a="abc";
        permute(a,0,a.length()-1);


    }
}
