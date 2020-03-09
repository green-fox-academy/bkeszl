import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        int [] myArray = {1, 11, 34, 11, 52, 61, 61,61, 1, 34};
        System.out.println(Arrays.toString(unique(myArray)));
    }

    public static int[] unique(int[] input){
        int[] returnArray = new int[0];
        Arrays.sort(input);
        int j = 1;
        for (int i = 0; i <input.length; i++) {
            if (input[j]!=input[i]) {
                returnArray = Arrays.copyOf(returnArray, returnArray.length+1);
                returnArray[returnArray.length-1] = input[i];
            }
            j++;
            if (j==input.length) {
                j =1;
            }
        }

        return returnArray;
    }
}
