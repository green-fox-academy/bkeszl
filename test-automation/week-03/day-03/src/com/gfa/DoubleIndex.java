package com.gfa;

public class DoubleIndex {
  public static void main(String[] args) {
    int[] test1arr = {1, 2, 3, 4};
    int[] test2arr = {9, 3, 3, 4};

    int test1index = 3;
    int test2index = 5;

    System.out.println(doubleIndex(test1arr, test1index));
    System.out.println(doubleIndex(test2arr, test2index));
  }

  public static int doubleIndex(int[] arr, int index) {
    try {
      return arr[index] * 2;
    } catch (ArrayIndexOutOfBoundsException e) {
      return -1;
    }
  }
}
