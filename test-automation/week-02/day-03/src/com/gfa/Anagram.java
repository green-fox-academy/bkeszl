package com.gfa;

public class Anagram {
  public static void main(String[] args) {
    System.out.println(isAnagram("dog", "god"));
    System.out.println(isAnagram("green", "fox"));
  }

  public static boolean isAnagram(String input1, String input2) {
   char[] chArr = input1.toCharArray();
   // input1 -> 'd', 'o', 'g'
    StringBuilder reverseInput1 = new StringBuilder();
    for (int i = chArr.length - 1; i >= 0; i--) {
      reverseInput1.append(chArr[i]);
    }
    return reverseInput1.toString().equals(input2);
  }
}
