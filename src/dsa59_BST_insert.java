class treenode11{
    int key;
    treenode11 right;
    treenode11 left;
    treenode11 (int x){
        key=x;
    }
}

public class dsa59_BST_insert {

    static treenode11 BST_insert(treenode11 root,int x) {
//        if(root==null){
//            return new treenode11(x);
//        }
//        if(root.key>x){
//            root.left=BST_insert(root.left,x);
//        }
//        else{
//            root.right=BST_insert(root.right,x);
//        }
//
//        return root;

        treenode11 temp = new treenode11(x);
        treenode11 parent = null;
        treenode11 curr = root;
        while (curr != null) {
            parent = curr;
            if (curr.key > x) {
                curr = curr.left;
            } else if (curr.key < x) {
                curr = curr.right;

            } else {
                return root;
            }
        }
        if (parent == null) {
            return temp;
        }
        if (parent.key > x) {
            parent.left = temp;
        } else {
            parent.right = temp;
        }
return root;
    }



    public static void main(String[] args) {
        treenode11 root=new treenode11(15);
        root.left=new treenode11(5);
        root.left.left=new treenode11(3);
        root.right=new treenode11(20);
        root.right.left=new treenode11(18);
        root.right.left.left=new treenode11(16);
        root.right.left=new treenode11(80);



    }
}
