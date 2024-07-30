import java.util.Arrays;

public class important_dsa18_strings_doesnotrepeat {
    static int firstnotrepeat(String str) {
        int res=Integer.MAX_VALUE;
        int array[]=new int[100];
        Arrays.fill(array,-1);
        for(int i=0;i<str.length();i++){
            if(array[str.charAt(i)]==-1){
                array[str.charAt(i)]=i;

            }else {
                array[str.charAt(i)]=-2;
            }

    }
        for(int i=0;i<100;i++){
            if(array[i]>=0){
                res=Integer.min(res,array[i]);
            }

        }
return res;
}




    public static void main(String[] args) {
        String name="NIIKKSSHHANY";
        System.out.println(firstnotrepeat(name));

    }
}
