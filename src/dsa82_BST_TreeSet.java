import java.util.TreeSet;

public class dsa82_BST_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.remove(2);
        ts.add(7);
        ts.add(5);
        for(Integer x:ts){
            System.out.println(x+ " ");
        }
    }
}
