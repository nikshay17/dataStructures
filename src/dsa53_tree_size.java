class treenode4{
    int key;
    treenode4 left;
    treenode4 right;
    treenode4(int value){
        key=value;
    }
}

public class dsa53_tree_size {
    static int count(treenode4 root){
        if(root==null){
            return 0;
        }
        else{
            return 1+count(root.left)+count(root.right);
        }




    }
    public static void main(String[] args) {
        treenode4 root=new treenode4(50);
        root.left=new treenode4(40);
        root.left.left=new treenode4(30);
        root.left.right=new treenode4(60);
        root.right=new treenode4(100);

        System.out.println(count(root));
    }
}
