import static org.junit.Assert.*;


import java.util.Arrays;
import org.junit.Test;

public class ExtensionTest {

  Extension extension = new Extension();

  @Test
  public void testAdd_8and3is11() {
    assertEquals(11, extension.add(8, 3));
  }

  @Test
  public void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
  }

  @Test
  public void testMaxOfThree_first() {
    assertEquals(5, extension.maxOfThree(5, 4, 3));
  }

  @Test
  public void testMaxOfThree_second() {
    assertEquals(8, extension.maxOfThree(3, 8, 5));
  }

  @Test
  public void testMedian_four() {
    assertEquals(11, extension.median(Arrays.asList(11,13,14,5)));
  }

  @Test
  public void testMedian_five() {
    assertEquals(3, extension.median(Arrays.asList(3,2,1,4,5)));
  }

  @Test
  public void testIsVowel_o() {
    assertTrue(extension.isVowel('o'));
  }

  @Test
  public void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  public void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  public void testTranslate_lagopus() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }

  @Test
  public void testTranslate_unoka() {
    assertEquals("uvunokava", extension.translate("unoka"));
  }
}