
class treenode5{
    int key;
    treenode5 left;
    treenode5 right;
    treenode5(int value){
        key=value;
    }
}
    public class dsa54_tree_maxVal {
       static int max(treenode5 root) {
           if(root==null){
               return Integer.MIN_VALUE;
           }
           else{
               return Math.max(root.key,Math.max(max(root.left),max(root.right)));
           }


       }




    public static void main(String[] args) {
        treenode5 root=new treenode5(50);
        root.left=new treenode5(40);
        root.left.left=new treenode5(30);
        root.left.right=new treenode5(60);
        root.right=new treenode5(100);

        System.out.println(max(root));
    }
}

