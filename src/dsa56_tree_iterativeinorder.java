import java.util.Stack;

class treenode7{
    int key;
    treenode7 left;
    treenode7 right;
    treenode7(int value){
        key=value;
    }
}
public class dsa56_tree_iterativeinorder {

    static void preorder(treenode7 root){
        Stack<treenode7> st=new Stack<treenode7>();
        treenode7 curr=root;
        while(curr!=null||st.isEmpty()==false){
            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            curr=st.pop();
            System.out.println(curr.key);
            curr=curr.right;
        }


    }








    public static void main(String[] args) {
        treenode7 root=new treenode7(50);
        root.left=new treenode7(40);
        root.left.left=new treenode7(30);
        root.left.right=new treenode7(60);
        root.right=new treenode7(100);

        preorder(root);
    }
}



