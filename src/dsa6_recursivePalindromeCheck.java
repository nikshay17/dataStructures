public class dsa6_recursivePalindromeCheck {
   static boolean isPal(String str,int a,int b){

        if(a==b||a>b){
            return true;
        }
        if (str.charAt(a) != str.charAt(b)) {

            return false;
        }
        return isPal(str,a+1,b-1);
    }
    public static void main(String[] args) {
        String check="nanan";
       int a=0;
        int b=check.length()-1;
        System.out.println(isPal(check,a,b));




    }
}
