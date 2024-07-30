

class treenode6{
    int key;
    treenode6 left;
    treenode6 right;
    treenode6(int value){
        key=value;
    }
}
public class dsa55_tree_height {

    static int height(treenode6 root){
        if(root==null){
            return 0;
        }
        return Math.max(1+height(root.left),1+height(root.right));


    }










    public static void main(String[] args) {
        treenode6 root=new treenode6(50);
        root.left=new treenode6(40);
        root.left.left=new treenode6(30);
        root.left.right=new treenode6(60);
        root.right=new treenode6(100);

        System.out.println(height(root));
    }
}

