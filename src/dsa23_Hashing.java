
class myhash{
    int [] arr;
    int cap,size;
    myhash(int c){
        cap=c;
        size=0;
        for(int i=0;i<cap;i++){
            arr[i]=-1;
        }
    }
    int hash(int key){
        return key%cap;
    }
     boolean search(int key){
     int h=hash(key);
     int i=h;
     while(arr[i]!=i){
        if(arr[i]==key){
            return true;

        }
        i=(i+1)%cap;
        if(i==h){
            return false;}
        }
     return false;

     }
boolean insert(int key){
        if(size==cap){
            return false;
        }
        int i=hash(key);
        while(arr[i]!=-1&&arr[i]!=-2&&arr[i]!=key){
            i=(i+1)%cap;
            if(arr[i]==key){
                return false;
            }
            else{
                arr[i]=key;
                size++;
                return true;
            }
        }

return false;
}


boolean erase(int key){
        int h=hash(key);
        int i=h;
        while(arr[i]!=-1){
            if(arr[i]==key){
                arr[i]=-2;
                return true;
            }
            i=(i+1)%cap;
            if(i==h){
                return false;
            }
        }
        return false;
}

}




public class dsa23_Hashing {
    public static void main(String[] args) {
   //Birthday Paradox 23-50% and 70-99%


    }
}





   /*
   Methods of Handling Collisions
   1.Chaining
   2.Open Handling
   2.1 Linear Probing:Linear  Search for the next empty slot when there is a collision
 Problem with Linear Probing:Clustering     Primary Cluster
   2.2 Quadratic Probing :hash(key,i)=(h(key)+i^2)%m
   Secondary Cluster
   It only works when load factor (alpha=n/m)is <0.5 and m is a prime number

   2.3 Double Hashing: hash(key,i)=(h1(key)+i*h2(key))%m


                   PERFORMANCE ANALYSIS OF SEARCH
             Asssumption:Every probe sequence looks at a random location
           Expected number of probes required=1/(1-alpha)
    */

