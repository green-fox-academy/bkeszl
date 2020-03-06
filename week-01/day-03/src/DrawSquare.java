import java.util.Scanner;
public class DrawSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many lines should the square have?: ");
        int num1 = scanner.nextInt();

        for (int i = 1; i <= num1; i++) {
            for (int j = 0; j < (num1) ; j++) {
                if ( (i < 2 || num1-1 < i) || (j < 1 || num1-2 < j) ) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



