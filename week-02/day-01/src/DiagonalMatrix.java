public class DiagonalMatrix {
    public static void main(String[] args) {
        int[][] array = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}