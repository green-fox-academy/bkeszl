import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many chickens does the farmer have?: ");
        int num1 = scanner.nextInt();
        System.out.print("How many pigs does the farmer have?: ");
        int num2 = scanner.nextInt();

        System.out.println("The animals have: " + ((num1*2)+(num2*4)) + " legs.");
    }
}
