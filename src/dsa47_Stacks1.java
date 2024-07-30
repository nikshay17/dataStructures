import java.io.*;
import java.util.Stack;


public class    dsa47_Stacks1 {
    public static void main(String[] args) {

        Stack<Integer> s=new Stack<Integer>();
        s.push(20);
        s.push(10);
        s.push(50);
        while (s.isEmpty()==false){
            System.out.println(s.pop());
        }

        s.push(5);
        s.push(56);
        System.out.println(s.size());
        System.out.println(s.peek());

    }
}
