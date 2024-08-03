class node18{
    int data;
    node18(int x){
        data=x;
    }
    node18 left;
    node18 right;
}

public class dsa76_LeftSideBinaryTree {
   static int maxlevel=0;
    public static void left(node18 root,int level){

        if(root==null){
            return;
        }
        if(maxlevel<level){
            System.out.print(root.data+" ");
            maxlevel=level;
        }
        left(root.left,level+1);
        left(root.right,level+1);




    }
    public static void main(String[] args) {
        node18 root = new node18(1);
        root.left = new node18(2);
        root.right = new node18(3);
        root.left.left = new node18(4);
        root.left.right = new node18(5);
        root.right.left = new node18(6);
        root.right.right = new node18(7);
left(root,1);



    }
}
