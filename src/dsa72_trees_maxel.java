import java.util.Stack;

class node17{
    int data;
    node17 left;
    node17 right;
    node17(int x){
        data=x;
    }
}

public class dsa72_trees_maxel {

    public static int max(node17 root)
    {
        Stack<node17> s=new Stack<>();
            int max=Integer.MIN_VALUE;

            node17 curr=root;

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
        node17 root=new node17(60);
        root.left=new node17(50);
        root.right=new node17(80);
        root.left.left=new node17(78);
        root.left.right=new node17(50);
        root.right.left=new node17(96);

        System.out.println(max(root));


    }
}
