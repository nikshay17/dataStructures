

class Node{
    int data;
    Node left;
    Node right;
    public Node(int x){
        data=x;
    }
}



public class dsa75_Trees_nodesAtTheKthLevel {
    public static void level(Node root,int k){
        if(root==null){
            return;
        }
        if(k==0){
            System.out.print(root.data+" ");
        }
        else{
            level(root.left,k-1);
            level(root.right,k-1);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        level(root,2);




    }
}
