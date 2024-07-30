import java.util.Arrays;
import java.util.Comparator;

class point {
    int x, y;

    point(int i, int j) {
        x = i;
        y = j;
    }
}
   class mysort implements Comparator<point> {

        public int compare(point a, point b) {
            return a.x - b.x;
        }
    }

    public  class dsa11_sorting2 {
        public static void main(String[] args) {
           point[] arr={new point(10,20),
            new point(3,12),new point(5,7)};
           Arrays.sort(arr,new mysort());
           for(int i=0;i<arr.length;i++) {
               System.out.println(arr[i].x+" "+arr[i].y);
           }            }

        }

