import static org.junit.Assert.*;


import org.junit.Test;

public class AnagramTest {

  @Test
  public void isAnagram() {
    String checkStringOne = "baboon";
    String checkStringTwO = "onbabo";
    boolean testBoolean = new Anagram().isAnagram(checkStringOne,checkStringTwO);
    assertTrue(testBoolean);
  }
}