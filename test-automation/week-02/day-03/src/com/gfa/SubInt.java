package com.gfa;

import java.util.Arrays;

public class SubInt {
  public static void main(String[] args) {
    //  Create a function that takes a number and an array of integers as parameters
    //  It returns the indices of the integers of the array which contain the given number
    //  or returns an empty array (if the number is not part of any of the integers in the array)

    //  Examples:
    System.out.println(Arrays.toString(findMatchingIndexes(1, new int[] {1, 11, 34, 52, 61})));
    //  should print: `[0, 1, 4]`
    System.out.println(Arrays.toString(findMatchingIndexes(9, new int[] {1, 11, 34, 52, 61})));
    //  should print: '[]'

    // Note: We are using Arrays.toString() function to print the array returned
    // You could just as well iterate over the array and print its items one by one
  }

  private static int[] findMatchingIndexes(int i, int[] ints) {
    int counter = 0;

    for (int j = 0; j < ints.length; j++) {
      String currentInt = String.valueOf(ints[j]);  // j == 1 -> "11"
      boolean currentContainsTarget = currentInt.contains(String.valueOf(i));

      if (currentContainsTarget) {
        //put j into return array
        counter++;
      }
    }

    int[] indices = new int[counter];
    int resultCounter = 0;
    for (int j = 0; j < ints.length; j++) {
      String currentInt = String.valueOf(ints[j]);  // j == 1 -> "11"
      boolean currentContainsTarget = currentInt.contains(String.valueOf(i));

      if (currentContainsTarget) {
        //put j into return array
        indices[resultCounter] = j;
        resultCounter++;
      }
    }
    return indices;
  }
}
