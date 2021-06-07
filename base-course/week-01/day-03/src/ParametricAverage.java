import java.util.Scanner;
import java.util.stream.DoubleStream;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gimme an int: ");
        int total = scanner.nextInt();
        double[] arr = new double[total];
        for (int i = 0; i < total ; i++) {
            System.out.print(" Gimme a numbaaaar: ");
            arr[i] = scanner.nextDouble();
        }
        double sum = DoubleStream.of(arr).sum();
        System.out.println("Sum of input: " + sum + "Avg is: " + (sum/5));
    }
}
