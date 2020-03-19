public class Fibonacci {
  public int FibonacciCalc(int userInput) {
    if (userInput == 0 || userInput < 0 ) {
      return -1;
    }
    int[] fibArray = new int[userInput];
    fibArray[0] = 0;
    fibArray[1] = 1;

    for (int i = 0; i < userInput; i++) {
      if (i<2) {
        continue;
      }
      fibArray[i] = fibArray[i-2]+fibArray[i-1];
    }
    return fibArray[userInput-1];
  }
}
