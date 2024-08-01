import java.util.Stack;

class Node6{
    int data;
    Node6 left;
    Node6 right;
    public Node6(int data){
        this.data = data;
    }
}


public class dsa74_IterativePreorderTraversal {

    static void PreorderTraversal(Node6 root){
        Stack<Node6> s=new Stack<>();
        Node6 curr=root;
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
        Node6 root = new Node6(1);
        root.left = new Node6(2);
        root.right = new Node6(3);
        root.left.left = new Node6(4);
        root.left.right = new Node6(5);
        root.right.left = new Node6(6);
        root.right.right = new Node6(7);
        PreorderTraversal(root);


    }
}
