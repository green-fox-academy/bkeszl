import static org.junit.Assert.*;


import java.util.HashMap;
import org.junit.Test;

public class CountLettersTest {

  @Test
  public void letterCounter_notNullString_Hashmap() {
    CountLetters countLetters = new CountLetters();
    String inputString = "yourmomfat";
    HashMap<Character, Integer> testHash = new HashMap<>();
    testHash.put('y',1);
    testHash.put('o',2);
    testHash.put('u',1);
    testHash.put('r',1);
    testHash.put('m',2);
    testHash.put('f',1);
    testHash.put('a',1);
    testHash.put('t',1);
    assertEquals(testHash, countLetters.letterCounter(inputString));
  }
}