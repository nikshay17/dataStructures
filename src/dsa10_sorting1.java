import java.util.Arrays;
import java.util.Collections;


public class dsa10_sorting1 {
    public static void main(String[] args) {
        Integer []arr={5,7,8,9,10};
        Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));


    }
}
