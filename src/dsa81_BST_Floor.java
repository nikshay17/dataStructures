class treenode18{
    treenode18 left;
    treenode18 right;
    int data;
    treenode18(int d){
        data = d;
    }

}


public class dsa81_BST_Floor {
    public static treenode18 floor(treenode18 root,int x){
        if(root==null){
            return null;
        }




        treenode18 res = null;
        while (root != null) {
            if (x == root.data) {
                return root;  // Found exact match
            } else if (x < root.data) {
                root = root.left;  // Move left, no need to update `res`
            } else {
                res = root;  // Update `res` to current node, move right
                root = root.right;
            }
        }
        return res;  // Return the closest node ≤ x
    }
    public static void main(String[] args) {
        treenode18 root = new treenode18(10);
        root.left = new treenode18(5);
        root.right = new treenode18(15);
        root.right.left = new treenode18(12);
        root.right.right = new treenode18(30);
        treenode18 curr=floor(root,4);
        System.out.println(curr.data);



    }
}
