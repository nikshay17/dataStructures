import java.util.Stack;


public class dsa48_Stacks_BalancedParanthesis {
  static   boolean matching(char a,char b){
        return((a=='('&&b==')') ||
                (a=='{'&&b=='}')||
                (a=='['&&b==']'));
    }

   static boolean isBalanced(String str){
        Stack<Character>s=new Stack<Character>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='{'||str.charAt(i)=='('||str.charAt(i)=='['){
                s.push(str.charAt(i));
            }else{
                if(s.empty()==true){
                    return false;
                }



            else if(matching(s.peek(),str.charAt(i))==false){
                return false;

            }else{
                s.pop();
            }}
        }
        return (s.empty()==true);

    }
    public static void main(String[] args) {
        System.out.println(isBalanced("{(])}"));
    

    }
}
