import java.lang.reflect.Array;
import java.util.Arrays;

public class DoubleItems {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 7};
        for (int i = 0; i <array.length ; i++) {
            array[i] = array[i]*2;
        }
        System.out.println(Arrays.toString(array));
    }
}
