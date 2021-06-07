import static org.junit.Assert.*;


import java.util.ArrayList;
import org.junit.Test;

public class SumTest {

  @Test
  public void sum_IntegerList_returnInteger() {
    ArrayList<Integer> testInput = new ArrayList<Integer>();
    testInput.add(0);
    testInput.add(1);
    testInput.add(2);
    testInput.add(3);
    int testInt = new Sum().sum(testInput);
    assertEquals(6, testInt);
  }

  @Test
  public void sum_emptyIntegerList_returnInteger() {
    ArrayList<Integer> testInput = new ArrayList<Integer>();
    int testInt = new Sum().sum(testInput);
    assertEquals(0, testInt);
  }

  @Test
  public void sum_SingleIntegerList_returnInteger() {
    ArrayList<Integer> testInput = new ArrayList<Integer>();
    testInput.add(3);
    int testInt = new Sum().sum(testInput);
    assertEquals(3, testInt);
  }

  @Test
  public void sum_NullIntegerList_returnInteger() {
    ArrayList<Integer> testInput = null;
    int testInt = new Sum().sum(testInput);
    assertEquals(0, testInt);
  }

}