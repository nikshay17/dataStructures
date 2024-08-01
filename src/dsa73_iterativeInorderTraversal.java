import java.util.ArrayList;
import java.util.Stack;

class node16{
    int data;
    node16(int x){
        data=x;
    }
    node16 left;
    node16 right;

}


public class dsa73_iterativeInorderTraversal {
    public static void inorder(node16 root){
        Stack<node16> st=new Stack<>();
        node16 curr=root;
        while(curr!=null||!st.isEmpty()){
            while(curr!=null){
                st.push(curr);
                curr=curr.left;


            }
            curr=st.pop();
            System.out.print(curr.data+" ");
            curr=curr.right;



        }
    }
    public static void main(String[] args) {
        node16 root=new node16(60);
        root.left=new node16(50);
        root.right=new node16(80);
        root.left.left=new node16(78);
        root.left.right=new node16(50);
        root.right.left=new node16(46);

        inorder(root);


    }
}
