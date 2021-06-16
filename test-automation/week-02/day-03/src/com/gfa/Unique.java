package com.gfa;

import java.util.Arrays;

public class Unique {
  public static void main(String[] args) {
    //  Create a function that takes an array of numbers as a parameter
    //  and returns an array of integers where every integer is unique (occurs only once)

    //  Example
    System.out.println(Arrays.toString(findUniqueItems(new int[] {1, 11, 34, 11, 52, 61, 61, 61, 1, 34})));
    //  should print: `[1, 11, 34, 52, 61]`
  }

  private static int[] findUniqueItems(int[] ints) {
    // count unique items
    int counter = 0;
    Arrays.sort(ints);

    for (int i = 0; i < ints.length - 1; i++) {
      if (ints[i] != ints[i + 1]) {
        counter++;
      }
    }

    // create return array
    int[] result = new int[counter + 1];
    int resultCounter = 0;
    // fill return array with uniques
    for (int i = 0; i < ints.length - 1; i++) {
      if (ints[i] != ints[i + 1]) {
        result[resultCounter] = ints[i];
        resultCounter++;
      }
    }

    result[result.length - 1] = ints[ints.length - 1];
    return result;
  }
}