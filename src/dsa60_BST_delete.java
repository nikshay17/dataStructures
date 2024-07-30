class treenode12{
    int key;
    treenode12 left;
    treenode12 right;
    treenode12(int x){
        key=x;
    }
}

public class dsa60_BST_delete {
    static treenode12 delete(treenode12 root,int x){
        if(root==null){
            return null;
        }
        if(root.key>x){
            root.left=delete(root.left,x);
        }
        else if(root.key<x){
            root.right=delete(root.right,x);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                treenode12 succ=getSucc(root);
                root.key=succ.key;
                root.right=delete(root.right,succ.key);
            }

        }  return root;
    }

    static treenode12 getSucc(treenode12 root){
        treenode12 curr=root.right;
        while(curr!=null&&curr!=null){
            curr=curr.left;
        }
        return curr;
    }
    public static void main(String[] args) {
        treenode12 root=new treenode12(15);
        root.left=new treenode12(5);
        root.left.left=new treenode12(3);
        root.right=new treenode12(20);
        root.right.left=new treenode12(18);
        root.right.left.left=new treenode12(16);
        root.right.left=new treenode12(80);


    }
}
