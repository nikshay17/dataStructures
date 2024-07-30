public class dsa61_bitmagic1 {
    public static void main(String[] args) {
int x=5;
int y=6;
        System.out.println(x&y);
        System.out.println(x|y);
        System.out.println(x^y);///bitwise xor
        System.out.println(~x);//not
        System.out.println(x<<30);//left shift
        System.out.println(x>>3);//in case of negative numbers 1 is added to the first position instead of 0
        System.out.println(x>>>1);//difference is just for negative no...and 0 is added at first position
    }
}
