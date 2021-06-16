package com.gfa;

import java.util.ArrayList;
import java.util.List;

public class PalindromeSearcher {
  public static void main(String[] args) {
    System.out.println(searchPalindrome("dog goat dad duck doodle never"));
    System.out.println(searchPalindrome("apple"));
    System.out.println(searchPalindrome("racecar"));
    System.out.println(searchPalindrome(""));
  }

  public static ArrayList<String> searchPalindrome(String input) {
    ArrayList<String> results = new ArrayList<>();

    for (int i = 0; i < input.length(); i++) {
      for (int j = i+1; j <= input.length(); j++) {
        String currSubStr = input.substring(i, j);
        if (isPalindrom(currSubStr) && currSubStr.length() >= 3) {
          results.add(currSubStr);
        }
      }
    }
    return results;
  }

  private static boolean isPalindrom(String input) {
    for (int i = 0; i < input.length() / 2; i++) {
      if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }



}
