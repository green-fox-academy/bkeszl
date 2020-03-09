import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gimme an in: ");
        int input = scanner.nextInt();
        System.out.println("The sum of all number until " +input+ " is "+ sum(input) );
    }

    private static int sum(int input) {
        int sumOfAll = 0;
        for (int i = 1; i <=input ; i++) {
            sumOfAll= sumOfAll+i;
        }
        return sumOfAll;
    }
}
