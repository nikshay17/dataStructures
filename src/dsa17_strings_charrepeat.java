

import java.util.*;
public class dsa17_strings_charrepeat {
    static int firstRepeat(String str){
        int res=Integer.MAX_VALUE;
        int f1[]=new int[256];
        Arrays.fill(f1,-1);
        for(int i=0;i<str.length();i++){
            if(f1[str.charAt(i)]==-1){
                f1[str.charAt(i)]=i;
            }
            else{
                res=Integer.min(res,f1[str.charAt(i)]);
            }

        }
        return (res==Integer.MAX_VALUE)?-1:res;
    }
    public static void main(String[] args) {
        String str="tugeeksforgeeks";
        System.out.println(firstRepeat(str));

    }
}
