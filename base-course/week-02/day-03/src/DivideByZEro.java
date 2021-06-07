public class DivideByZEro {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        try {
            System.out.println(divide(num1, num2));
        } catch (ArithmeticException n) {
            System.out.println("Cant divide by zero");
        }
    }
    public static int divide(int n1, int n2) {
        return n1/n2;
    }
}
