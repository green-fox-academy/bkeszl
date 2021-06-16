package com.gfa;

public class PalindromeBuilder {
  public static void main(String[] args) {
    System.out.println(createPalindrome(""));
    System.out.println(createPalindrome("greenfox"));
    System.out.println(createPalindrome("123"));
  }

  public static String createPalindrome(String base) {
    //    StringBuilder sb = new StringBuilder(base);
    //    String reverseBase = sb.reverse().toString();

    String reverseBase = "";
    char[] baseArr = base.toCharArray();

    for (int i = baseArr.length - 1; i >= 0 ; i--) {
      reverseBase += baseArr[i];
    }

    return base + reverseBase;
  }
}
