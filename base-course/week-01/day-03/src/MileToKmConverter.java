import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gimme miles (double format): ");
        double userInput = scanner.nextDouble();
        System.out.println("Your miles in KM's: " + (userInput*1.609));

    }
}