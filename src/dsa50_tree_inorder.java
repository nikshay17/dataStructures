class treenode1{
    int key;
    treenode1 left;
    treenode1 right;
    treenode1(int value){
        key=value;
    }
}

public class dsa50_tree_inorder {
    static void inorder(treenode1 root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);
        }
    }
    public static void main(String[] args) {

        treenode1 root=new treenode1(50);
        root.left=new treenode1(40);
        root.left.left=new treenode1(30);
        root.left.right=new treenode1(60);
        root.right=new treenode1(100);

        inorder(root);
         

        
    }
}
