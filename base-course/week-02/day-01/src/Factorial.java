import java.util.Scanner;

public class Factorial {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Gimme an in: ");
            int input = scanner.nextInt();
            System.out.println("The factorial of " + input + " is " + fact(input) );
        }

        private static int fact(int input) {
            int fact = 1;
            for (int i = 1; i <=input ; i++) {
                fact = fact*i;
            }
            return fact;
        }
}

