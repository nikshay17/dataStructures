class Distance{
    int val;
    Distance(int x){
        val=x;
    }
}

class TreeNode1{
    int data;
    TreeNode1 left;
    TreeNode1 right;
    TreeNode1(int data){
        this.data = data;
    }
}


public class dsa80_Trees_BurnBinaryTreeFromLeaf {
    static int res=0;
    public static int bBT(TreeNode1 root,int leaf,Distance d){
        burnBinaryTree(root,leaf,d);
        return res;
    }

    public static int burnBinaryTree(TreeNode1 root,int leaf,Distance d) {
        if(root==null){
            return 0;
        }
        if(root.data==leaf){
            d.val=0;
            return 1;
        }
        Distance ldis=new Distance(-1);
        Distance rdis=new Distance(-1);
        int lh=burnBinaryTree(root.left,leaf,ldis);
        int rh=burnBinaryTree(root.right,leaf,rdis);
        if(ldis.val!=-1){
            d.val=ldis.val+1;
            res=Math.max(res,rh+d.val);

        }

        else if(rdis.val!=-1){
            d.val=rdis.val+1;
            res=Math.max(res,lh+d.val);
        }
return 1+Math.max(lh,rh);
    }
    public static void main(String[] args) {

        TreeNode1 root = new TreeNode1(5);
        root.left = new TreeNode1(8);
        root.right = new TreeNode1(3);
        root.left.right = new TreeNode1(2);
        root.left.left = new TreeNode1(1);
        root.right.left = new TreeNode1(0);
        root.right.right = new TreeNode1(4);
        Distance d=new Distance(0);

        int res=bBT(root,4,d);
        System.out.println(res);


    }
}
