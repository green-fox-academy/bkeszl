package com.gfa;

public class AppendA {
  public static void main(String[] args) {
    // - Create a string variable named `typo` and assign the value `Chinchill` to it
    // - Write a function called `appendA()` that gets a string as an input,
    //   appends an 'a' character to its end and returns the modified string
    //
    // - Print the result of `appendA(typo)`

    String typo = "Chinchill";

    String result = appendA(typo);

    System.out.println(result);
  }

  public static String appendA(String appendTo) {
    return appendTo + 'a';
  }
}
