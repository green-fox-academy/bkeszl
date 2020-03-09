import java.util.Arrays;

public class SubInt {
    public static void main(String[] args) {
        int query = 2;
        int[] array = {22, 23, 56, 16, 82};

        System.out.println(Arrays.toString(subInt(Integer.toString(query), Arrays.stream(array).mapToObj(String::valueOf).toArray(String[]::new))));
    }
    public static String[] subInt(String query, String[] array) {
        String[] returnArray = new String[0];
        for (int i = 0; i <array.length ; i++) {
            if (-1 < array[i].indexOf(query)) {
                returnArray = Arrays.copyOf(returnArray, returnArray.length+1);
                returnArray[returnArray.length-1] = Integer.toString(i);
            }
        }

        return returnArray;
    }
}
