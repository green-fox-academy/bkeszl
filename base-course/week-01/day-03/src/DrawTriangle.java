import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many lines should the triangle have?: ");
        int num1 = scanner.nextInt();

        for (int i = 1; i <= num1; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
