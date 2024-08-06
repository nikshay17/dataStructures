class treenode{
    int data;
    treenode left;
    treenode right;
    treenode(int data){
        this.data = data;

    }
}


public class dsa78_treeToDLL {
static treenode prev=null;
    public static treenode treeDLL(treenode root){

        if(root == null) {
            return root;
        }
        treenode head=treeDLL(root.left);
        if(prev==null){
            head=root;
        }
        else{
            root.left=prev;
            prev.right=root;


        }

        prev=root;
        treeDLL(root.right);
        return head;
    }
    public static void main(String[] args) {
        treenode root = new treenode(5);
        root.left = new treenode(4);
        root.right = new treenode(3);
        root.left.right = new treenode(2);
        root.left.left = new treenode(1);
        root.right.left = new treenode(0);
        root.right.right = new treenode(4);
        treenode head=treeDLL(root);
        while (head!=null){
            System.out.println(head.data);
            head=head.right;
        }

    }
}
