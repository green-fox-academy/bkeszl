package com.gfa;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonalFinance {
  public static void main(String[] args) {
    ArrayList<Integer> expenses = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120, 553));

    //sum
    //max
    int sum = 0;
    int max = 0;
    int min  = expenses.get(0);

    for (Integer i : expenses) {
      sum += i;
      if (i > max) {
        max = i;
      }
      if (i < min) {
        min = i;
      }
    }

    System.out.println(sum);
    System.out.println(max);
    System.out.println(min);
    System.out.println(sum / expenses.size());
  }
}
