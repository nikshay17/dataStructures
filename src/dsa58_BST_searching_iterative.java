class treenode10{
    int key;
    treenode10 right;
    treenode10 left;
    treenode10 (int x){
        key=x;
    }
}


public class dsa58_BST_searching_iterative {
    static boolean BST_search(treenode10 root,int x){
        while(root!=null){
            if(root.key==x){
                return true;
        }

            else if(root.key>x){
                root=root.left;
            }
            else{
                root=root.right;
            }



    } return false;}
    public static void main(String[] args) {
        treenode10 root=new treenode10(15);
        root.left=new treenode10(5);
        root.left.left=new treenode10(3);
        root.right=new treenode10(20);
        root.right.left=new treenode10(18);
        root.right.left.left=new treenode10(16);
        root.right.left=new treenode10(80);
        System.out.println(BST_search(root,45));

    }}

