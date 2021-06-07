import java.util.Scanner;
    public class DrawPyramid {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("How many lines should the pyramid have?: ");
            int num1 = scanner.nextInt();

            for (int i = 1; i <= num1; i++) {
                for (int j = 0; j < (num1+(num1-1)) ; j++) {
                    if ( ( (num1-1-i) < j) && j < (num1-1+i)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }


