import java.util.*;
import java.math.*;

public class important_dsa19_strings_LexicographicRank {
    static int fact(int n){
        if(n<=1){
            return 1;
        }return n*fact(n-1);
    }


  static int lexRank(String str){            
        int rank=1;
        int n=str.length();
        int mal=fact(n);
        int count[]=new int[256];
      Arrays.fill(count,0);
      for(int i=0;i<n;i++){
          count[str.charAt(i)]++;
      }
      for(int i=1;i<256;i++){
          count[i]+=count[i-1];
      }
      for(int i=0;i<n;i++){
          mal=mal/n-i;
          rank=rank+count[str.charAt(i)]*mal;
          for(int j=str.charAt(i);j<256;j++){
              count[j]--;

          }

      }return rank;



    }
    public static void main(String[] args) {
        System.out.println(lexRank("ajyua"));

    }

}
