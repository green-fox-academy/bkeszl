import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Finance {
    public static void main(String[] args) {
        List<Integer> expenses = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));
        finReport(expenses);
    }
    public static void finReport(List<Integer> input) {
        int sum = 0;
        int max = 0;
        int min = 2147483647;
        int i = 0;
        for (int value:input) {
            sum=sum+value;
            if (max<value) {
                max = value;
            }
            if (value<min) {
                min=value;
            }
            i++;
        }
        System.out.println("Money spent: " + sum + "\nBiggest expense: " + max + "\nSmallest expense: " + min+ "\nAverage spending: " +(sum/i));
    }
}
