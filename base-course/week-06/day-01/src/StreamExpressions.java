import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    System.out.println("Exercise 4");
    numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    numbers.stream()
        .filter(number -> number % 2 == 1 || number % 2 == -1)
        .mapToDouble(Integer::doubleValue)
        .average()
        .ifPresent(System.out::println);

    System.out.println("Exercise 5");
    numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
    int sum = numbers.stream()
        .filter(number -> number % 2 == 1 || number % 2 == -1)
        .mapToInt(Integer::intValue)
        .sum();
    System.out.println(sum);

    System.out.println("Exercise 6");
    String stringIn = "fInD thE LOWerCasE";
    stringIn.chars()
        .filter(Character::isUpperCase)
        .mapToObj(Character::toChars)
        .forEach(System.out::println);

    System.out.println("Exercise 7");
    List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
    String givenParameter = "A";
    cities.stream()
        .filter(str -> str.startsWith(givenParameter))
        .forEach(System.out::println);

    System.out.println("Exercise 8");
    List<Character> characters = Arrays.asList('b', 'i', 'g');
    StringBuilder charString = new StringBuilder();
    characters.stream()
        .forEach(c -> charString.append(c.charValue()));
    System.out.println(charString.toString());

    System.out.println("Exercise 9");
    String givenString = "I have been very naughty!";
    System.out.println(givenString.chars()
        .mapToObj(Character::toString)
        .collect(Collectors.groupingBy(c -> c, Collectors.counting())));

    System.out.println("Exercise 10");
    List<Fox> foxesList = new ArrayList<>();
    foxesList.add(new Fox("Enie", "green", 3));
    foxesList.add(new Fox("Menie", "green", 2));
    foxesList.add(new Fox("Minie", "green", 5));
    foxesList.add(new Fox("Moe", "green", 7));
    foxesList.add(new Fox("Galbatorix", "red", 3));

    foxesList.stream()
        .filter(f -> f.getColor().equals("green"))
        .map(Fox::getName)
        .forEach(System.out::println);

    System.out.println("----------");

    foxesList.stream()
        .filter(f -> f.getColor().equals("green") && f.getAge() < 5)
        .map(Fox::getName)
        .forEach(System.out::println);

    System.out.println("----------");

    System.out.println(
    foxesList.stream()
        .collect(Collectors.groupingBy(Fox::getColor, Collectors.counting()))
    );
  }
}
