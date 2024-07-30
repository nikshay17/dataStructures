import java.util.Stack;

class Node4{
    int data;
    Node4 left;
    Node4 right;
    Node4(int x){
        data=x;
    }
}

public class dsa72_trees_maxel {

    public static int max(Node4 root)
    {
        Stack<Node4> s=new Stack<>();
            int max=Integer.MIN_VALUE;

            Node4 curr=root;

            while(curr!=null||s.size()>0){

                while(curr!=null){
                    s.push(curr);
                    max=Math.max(max,curr.data);
                    curr=curr.left;

                }
                curr=s.pop();
                max=Math.max(max,curr.data);
                curr=curr.right;


            }


return max;
    }
    public static void main(String[] args) {
        Node4 root=new Node4(60);
        root.left=new Node4(50);
        root.right=new Node4(80);
        root.left.left=new Node4(78);
        root.left.right=new Node4(50);
        root.right.left=new Node4(46);

        System.out.println(max(root));


    }
}
