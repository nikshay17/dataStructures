import java.util.Stack;

class treenode9{
    int key;
    treenode9 left;
    treenode9 right;
    treenode9(int value){
        key=value;
    }
}
public class dsa58_BST_searching_recursive {

    static boolean BST_search(treenode9 root, int x) {
        Stack<treenode9> st = new Stack<treenode9>();
        if (root == null) {
            return false;
        } else if (root.key == x) {
            return true;
        } else if (root.key > x) {
           return BST_search(root.left, x);


        } else {
           return BST_search(root.right, x);
        }


    }








    public static void main(String[] args) {
        treenode9 root=new treenode9(15);
        root.left=new treenode9(5);
        root.left.left=new treenode9(3);
        root.right=new treenode9(20);
        root.right.left=new treenode9(18);
        root.right.left.left=new treenode9(16);
        root.right.left=new treenode9(80);
        System.out.println(BST_search(root,3));



    }
}

