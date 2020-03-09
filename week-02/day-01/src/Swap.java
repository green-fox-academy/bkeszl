import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        String[] orders = {"first", "second", "third"};
        String buffer = new String();

        buffer =  orders[0];
        orders[0] = orders[2];
        orders[2] = buffer;

        System.out.println(Arrays.toString(orders));
    }
}
