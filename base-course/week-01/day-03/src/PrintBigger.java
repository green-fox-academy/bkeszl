import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gimme an int: ");
        int num1 = scanner.nextInt();
        System.out.print("Gimme an int: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("They are equal");
        } else if (num1 < num2) {
            System.out.println(num2 + " is bigger");
        } else {
            System.out.println(num1 + " is bigger");
        }
    }
}
