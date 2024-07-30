 class Queue{
    int []arr;
    int front,cap,size;
    Queue(int c){
        arr=new int[c];
        cap=c;
        front=0;
        size=0;

    }
 }




public class dsa49_queue {
    static boolean isFull(int cap,int size){
        return(cap==size);
    }
    static boolean isEmpty(int size){
        return size==0;

    }





    public static void main(String[] args) {
        /* equeue add an item
        * dequeue remove an item*/
        /*rear=(front+size-1)%cap
        * front=(front+1)%cap*/

    }
}

