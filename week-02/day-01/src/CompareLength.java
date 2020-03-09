public class CompareLength {
    public static void main(String[] args) {
        int[] firstArrayOfNumbers = {1, 2, 3};
        int[] secondArrayOfNumbers = {5, 6};

        if (firstArrayOfNumbers.length < secondArrayOfNumbers.length) {
            System.out.println("The second array has more!");
        } else {
            System.out.println("The first array has more!");

        }
    }
}
