class treenode3{
    int key;
    treenode3 left;
    treenode3 right;
    treenode3(int value){
        key=value;
    }
}


public class dsa52_tree_postorder {
    static void postorder(treenode3 root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.key);
        }
    }
    public static void main(String[] args) {
        treenode3 root=new treenode3(50);
        root.left=new treenode3(40);
        root.left.left=new treenode3(30);
        root.left.right=new treenode3(60);
        root.right=new treenode3(100);

        postorder(root);

    }
}
