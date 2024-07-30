class treenode2{
    int key;
    treenode2 left;
    treenode2 right;

    treenode2(int value){
        key=value;
    }

}


public class dsa51_tree_preorder {
    static void preorder(treenode2 root){
        if(root!= null){
            System.out.println(root.key);
            preorder(root.left);
            preorder(root.right);
        }



    }
    public static void main(String[] args) {

        treenode2 root=new treenode2(50);
        root.left=new treenode2(40);
        root.left.left=new treenode2(30);
        root.left.right=new treenode2(60);
        root.right=new treenode2(100);

        preorder(root);

    }
}
