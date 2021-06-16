package com.gfa;

public class Sum {
  public static void main(String[] args) {
    // Write a function called `sum()` that returns
    // the sum of numbers from zero to the given parameter
  }

  public static int sum(int peak) {
    int sum = 0;
    for (int i = 0; i <= peak; i++) {
      sum += i;
    }
    return sum;
  }
}
