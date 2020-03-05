import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gimme a number: ");
        float num = scanner.nextFloat();

        if (num <= 0) {
            System.out.println("Not enough");
        } else if (num == 1) {
            System.out.println("One");
        } else if (num == 2) {
            System.out.println("Two");
        } else if (num > 2) {
            System.out.println("A Lot");
        } else {
            System.out.println("cheeky input");

        }
    }
}
