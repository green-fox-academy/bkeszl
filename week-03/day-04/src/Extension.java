import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    int max = a;
    if (a < b)
      max = b;
      if (b < c) {
        max = c;
      }
      return max;
  }

  int median(List<Integer> pool) {
    Collections.sort(pool);
    return pool.get((pool.size()-1)/2);
  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i', 'A', 'U', 'O', 'E', 'I').contains(c);
  }

  String translate(String hungarian) {
    String teve = hungarian;
    List<String> vowels = Arrays.asList("a", "u", "o", "e", "i", "A", "U", "O", "E", "I");
    for (int i = 0; i < vowels.size(); i++) {
      if (teve.contains(vowels.get(i))) {
        teve = teve.replaceAll(vowels.get(i), vowels.get(i) + "v" + vowels.get(i));
      }
    }
    return teve;
  }
}