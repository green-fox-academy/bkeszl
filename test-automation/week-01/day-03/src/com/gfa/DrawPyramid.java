package com.gfa;

import java.util.Scanner;

public class DrawPyramid {
  // Write a program that reads a number from the standard input, then draws a
  // pyramid like this:
  //
  //
  //    *
  //   ***
  //  *****
  // *******
  //
  // The pyramid should have as many lines as the number was
  public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    int lines = sc.nextInt();

    int space = lines - 1;
    for (int i = 0; i <= lines; i++) {
      for (int j = 0; j <= space; j++) {
        System.out.print(" ");
      }
      space--;
      for (int j = 0; j < i * 2 - 1; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
