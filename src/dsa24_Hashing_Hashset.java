import java.util.HashSet;
import java.util.Iterator;
public class dsa24_Hashing_Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        set.add(23);
        set.add(45);
        set.add(4);
        set.add(23);


        if(set.contains(23)){
            System.out.println("set contains 23");
        }

        set.remove(45);
        if(!set.contains(45)){
            System.out.println("does not contain 1");
        }
        System.out.println(set);
            Iterator it=set.iterator();
//hasNext,next
       while(it.hasNext()){
           System.out.println(it.next());
       }
    }
}
