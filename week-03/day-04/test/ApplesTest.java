import static org.junit.Assert.*;


import org.junit.Test;

public class ApplesTest {

  @Test
  public void getApplesTest() {
    String testString = new Apples().getApples();
    assertEquals("aples", testString);
  }
}