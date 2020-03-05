import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretnumber = 35;
        do {
            System.out.print("Guess: ");
            float num1 = scanner.nextFloat();
            if (num1 < secretnumber) {
                System.out.println("The stored number is higher");
            } else if (secretnumber < num1) {
                System.out.println("The stored number is lower");
            } else {
                System.out.println("You found the number: 35");
                break;
            }
        } while (true);
        System.out.println("Ending program");
    }
}
