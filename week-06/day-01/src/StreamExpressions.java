import java.util.Arrays;
import java.util.List;

public class StreamExpressions {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    System.out.println("Exercise 1");
    numbers.stream()
        .filter(number -> number % 2 == 0)
        .forEach(System.out::println);

    System.out.println("Exercise 2");
    numbers.stream()
        .filter(number -> 0 < number)
        .map(number -> number * number)
        .forEach(System.out::println);

    System.out.println("Exercise 3");
    numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
    numbers.stream()
        .filter(number -> Math.sqrt(20) < number)
        .forEach(System.out::println);
  }
}
