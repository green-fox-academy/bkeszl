import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gimme a round number: ");
        int num = scanner.nextInt();
        if(num==0) {
            System.out.println("Number is zero");
        } else if (num % 2 == 0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
