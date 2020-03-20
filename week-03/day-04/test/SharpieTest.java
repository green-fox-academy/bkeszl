import static org.junit.Assert.*;


import java.awt.Color;
import org.junit.Before;
import org.junit.Test;

public class SharpieTest {

  private Sharpie sharpie;

  @Before
  public void sharpieTest() {
    String blue = "blue";
    float width = 2f;
    sharpie = new Sharpie(blue, width);
  }

  @Test
  public void useTest_ValidSharpie_SharpieInkamountDecreases() {
    sharpie.use();
    assertEquals(99, sharpie.inkAmount, 0.0f );
  }
  //not sure, what else could I test?
}