import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class dsa25_Hashing_Hashmap {
    public static void main(String[] args) {
        HashMap<String ,Integer> m=new HashMap<String,Integer>();
        m.put("gfg",10);
        m.put("ide",15);
        m.put("courses",20);
//        System.out.println(m);
//        System.out.println(m.size());
      /*  if(m.containsKey("ide")){
            System.out.println("yes");x`
        }*/
//        if(m.containsKey(15)){
//            System.out.println();
//        }

//        else{
////            System.out.println("no");
//        }
//        m.remove("ide");
        Set<String>keys =m.keySet();
        for(String key:keys){
            System.out.println(key+m.get(key));
        }
        for(Map.Entry<String,Integer> e:m.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
//        for(Map.Entry<String,Integer>e:m.entrySet()){
//            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
//}
