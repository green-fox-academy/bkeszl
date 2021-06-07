import java.util.ArrayList;
import java.util.HashMap;

public class CountLetters {
  public HashMap<Character, Integer> letterCounter(String inputString) {
    HashMap<Character, Integer> letters = new HashMap<Character, Integer>();


    for (int i = 0; i <inputString.length() ; i++) {
      if (!letters.containsKey(inputString.charAt(i))) {
        letters.put(inputString.charAt(i), 1);
      } else {
        letters.replace(inputString.charAt(i), letters.get(inputString.charAt(i)) +1);
      }
    }

    return letters;
  }
}
