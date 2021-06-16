package com.gfa;

import java.util.Arrays;

public class Anagram {
  public static void main(String[] args) {
    System.out.println(isAnagram("dog", "god"));
    System.out.println(isAnagram("green", "fox"));
    System.out.println(isAnagram("listen", "silent"));

  }

  public static boolean isAnagram(String input1, String input2) {
   char[] in1ChArr = input1.toCharArray();
   char[] in2ChArr = input2.toCharArray();

    Arrays.sort(in1ChArr);
    Arrays.sort(in2ChArr);

    return Arrays.equals(in1ChArr, in2ChArr);
    //    input1 -> 'd', 'o', 'g'
    //    StringBuilder reverseInput1 = new StringBuilder();
    //    for (int i = chArr.length - 1; i >= 0; i--) {
    //      reverseInput1.append(chArr[i]);
    //    }
    //    return reverseInput1.toString().equals(input2);
  }
}
