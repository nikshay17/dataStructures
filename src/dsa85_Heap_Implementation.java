class minheap{
    int [] arr;
    int cap;
    int size;
    minheap(int c){
        arr=new int[c];
        size=0;
        cap=c;
    }
    int left(int i){
        return 2*i+1;
    }
    int right(int i){
        return 2*i+2;
    }
    int parent(int i){
        return (i-1)/2;
    }
}


public class dsa85_Heap_Implementation {
    public static void main(String[] args) {
        minheap m=new minheap(5);
        m.arr[0]=10;
        m.arr[1]=20;
        m.arr[2]=30;
        m.arr[3]=40;
        m.arr[4]=50;
        System.out.println(m.arr[m.left(0)]);

    }
}
