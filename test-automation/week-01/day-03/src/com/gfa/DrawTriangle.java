package com.gfa;

import java.util.Scanner;

public class DrawTriangle {
  // Write a program that reads a number from the standard input, then draws a
  // triangle like this:
  //
  // *
  // **
  // ***
  // ****
  //
  // The triangle should have as many lines as the number was

  public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    int lines = sc.nextInt();

    for (int i = 0; i < lines; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
