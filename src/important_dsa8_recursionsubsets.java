public class important_dsa8_recursionsubsets {
    static void subsets(String str,String curr,int index){

        if(index==str.length()){
            System.out.println(curr+" ");
            return;
        }

        subsets(str,curr,index+1);
        subsets(str,curr+str.charAt(index),index+1);
    }

    public static void main(String[] args) {
        String name="abb";
        String curr=" ";
        int index=0;
        subsets(name,curr,index);

    }
}
