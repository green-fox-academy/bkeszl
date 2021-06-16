package com.gfa;

public class Factorial {
  public static void main(String[] args) {
    // - Create a function called `calculateFactorial()`
    //   that returns the factorial of its input

    System.out.println(calculateFactorial(12));
  }

  public static long  calculateFactorial(int toFactor) {
    long result = toFactor;

    if (toFactor == 0) {
      return 1;
    }
    //i = 11 -> 10, 9 ... 1
    for (int i = toFactor - 1; i >= 1 ; i--) {
      result *= i;
    }
    return result;
  }
}
