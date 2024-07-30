import java.util.*;
import java.util.LinkedList;
public class dsa69_hashmap_IMPLIMENTATION {
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;
        private int N;
        LinkedList<Node>buckets[];
        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }

        private int HashFunction(K key){
            int bi=key.hashCode();
            return Math.abs(bi)%N;
        }

          private int SearchInLL(K key,int bi){
            LinkedList<Node>ll=buckets[bi];
//            for(int i=0;ll.size();i++){
//                if(ll.get(i).key==key){
//                    return i;
//                }
//
//            }
            return -1;
        }
        public void put(K key,V value){
            int bi=HashFunction(key);
            int di=SearchInLL(key,bi);
            

        }
//        public boolean containskey ( K key,V value){
//
//        }
//        public V remove (K key,V value){
//
//        }
//        public V get (K key,V value){
//
//        }

    }
    public static void main(String[] args) {

    }
}
