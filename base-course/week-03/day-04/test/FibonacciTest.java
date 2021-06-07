import static org.junit.Assert.*;


import org.junit.Test;

public class FibonacciTest {

  @Test
  public void fibonacciCalc_integerPositive_returnsInt() {
    int userInput = 6;
    Fibonacci fibonacci = new Fibonacci();
    assertEquals(5, fibonacci.FibonacciCalc(userInput));
  }

  @Test
  public void fibonacciCalc_integerNegative_returnsMinusOne() {
    int userInput = -15;
    Fibonacci fibonacci = new Fibonacci();
    assertEquals(-1, fibonacci.FibonacciCalc(userInput));
  }

  @Test
  public void fibonacciCalc_integerZero_returnsMinusOne() {
    int userInput = 0;
    Fibonacci fibonacci = new Fibonacci();
    assertEquals(-1, fibonacci.FibonacciCalc(userInput));
  }


}