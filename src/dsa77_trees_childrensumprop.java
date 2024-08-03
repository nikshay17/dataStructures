class node19{
    int data;
    node19(int x){
        data=x;
    }
    node19 left;
    node19 right;
}

public class dsa77_trees_childrensumprop {

    static boolean childsum(node19 root){
        if(root==null){
            return true;
        }
        if(root.left==null&&root.right==null){
            return true;
        }
        int sum=0;
        if(root.left!=null){
            sum+=root.left.data;
        }
        if(root.right!=null){
            sum+=root.right.data;
        }
        return (root.data==sum)&&childsum(root.left)&&childsum(root.right);
    }


    public static void main(String[] args) {
        node19 root = new node19(1);
        root.left = new node19(2);
        root.right = new node19(3);
        root.left.left = new node19(4);
        root.left.right = new node19(5);
        root.right.left = new node19(6);
        root.right.right = new node19(7);
        System.out.println(childsum(root));




    }
}
