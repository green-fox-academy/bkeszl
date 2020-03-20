package cowsandbulls;

import static org.junit.Assert.*;


import java.util.regex.Pattern;
import org.junit.Test;

public class GameLogicTest {

  @Test
  public void randomNumberGenerator_returnsStringLengthFour() {
    String random = new GameLogic().randomNumberGenerator();
    String fourLength = "0001";
    assertEquals(fourLength.length(), random.length());
  }

  @Test
  public void randomNumberGenerator_returnsStringOfNumbers() {
    String random = new GameLogic().randomNumberGenerator();
    boolean numbers = false;
    if (Pattern.matches("[0-9]+",random)) {
      numbers = true;
    }
    assertTrue(numbers);
  }

 /* @Test
  public void userGuess_ReturnsString() {
    String guess = new GameLogic().userGuess(); //careful, scanner only works with psvm
    String myguessIsGonaBe = "4123bbb";
    assertEquals(myguessIsGonaBe,guess);
  }*/

  @Test
  public void gameLoopContents_canFinish() {
    GameLogic loop = new GameLogic();
    loop.gameLoopContents("1234", "1434");
    assertFalse(loop.isFinished);
  }
}