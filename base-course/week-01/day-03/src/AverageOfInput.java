import java.util.Scanner;
import java.util.stream.DoubleStream;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] num1 = new double [5];
        for (int i = 0; i <5 ; i++) {
            System.out.print("Gimme an int: ");
            num1[i] = scanner.nextInt();
        }
        double sum = DoubleStream.of(num1).sum();
        System.out.println("Sum of input: " + sum + "Avg is: " + (sum/5));
    }
}
