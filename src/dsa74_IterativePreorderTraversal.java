import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node7{
    int data;
    Node7 left;
    Node7 right;
    public Node7(int data){
        this.data = data;
    }
}


public class dsa74_IterativePreorderTraversal {

    static void PreorderTraversal(Node7 root){
        
        Stack<Node7> s=new Stack<>();
        Node7 curr=root;
        while(curr!=null||s.isEmpty()==false){

            while(curr!=null){
                System.out.print(curr.data+" ");
                if(curr.right!=null){
                    s.push(curr.right);}
                curr=curr.left;
            }


            if(s.isEmpty()==false){
                curr=s.pop();
            }



        }

    }
    public static void main(String[] args) {
        Node7 root = new Node7(1);
        root.left = new Node7(2);
        root.right = new Node7(3);
        root.left.left = new Node7(4);
        root.left.right = new Node7(5);
        root.right.left = new Node7(6);
        root.right.right = new Node7(7);
        PreorderTraversal(root);


    }
}
