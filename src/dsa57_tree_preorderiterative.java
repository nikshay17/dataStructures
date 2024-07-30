import java.util.Stack;

class treenode8{
    int key;
    treenode8 left;
    treenode8 right;
    treenode8(int value){
        key=value;
    }
}
public class dsa57_tree_preorderiterative {

    static void preorder(treenode8 root){
        if(root==null){
            return ;

        }

        Stack<treenode8>st=new Stack<treenode8>();
        st.push(root);
        while(st.isEmpty()==false){
            treenode8 curr=st.pop();
            System.out.println(curr.key);
        if(curr.right!=null){
            st.push(curr.right);
        }
        if(curr.left!=null){
            st.push(curr.left);
        }
        }





    }








    public static void main(String[] args) {
        treenode8 root=new treenode8(50);
        root.left=new treenode8(40);
        root.left.left=new treenode8(30);
        root.left.right=new treenode8(60);
        root.right=new treenode8(100);

        preorder(root);
    }
}

