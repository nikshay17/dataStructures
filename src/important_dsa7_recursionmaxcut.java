import java.lang.Math;
public class important_dsa7_recursionmaxcut {
   static int maxCut(int n,int a,int b,int c) {
       if (n == 0) {
           return 0;
       }
       if (n < 0) {
           return -1;

       }
       int res = Math.max(Math.max(maxCut(n - a, a, b, c), maxCut(n - b, a, b, c)), maxCut(n - c, a, b, c));
       if (res == -1) {
           return -1;
       }return res+1;
   }
    public static void main(String[] args) {
       int number=5;
       int a=1;
       int b=2;
       int c=3;
        System.out.println(maxCut(number,a,b,c));

    }
}
