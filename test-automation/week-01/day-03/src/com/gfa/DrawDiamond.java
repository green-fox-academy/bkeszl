package com.gfa;

import java.util.Scanner;

public class DrawDiamond {
  // Write a program that reads a number from the standard input, then draws a
  // diamond like this:
  //
  //
  //    *
  //   ***
  //  *****
  // *******
  //  *****
  //   ***
  //    *
  //
  // The diamond should have as many lines as the number was

  public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    int lines = sc.nextInt();

    int upperPyramidLines = lines/2;

    int space = upperPyramidLines - 1;
    for (int i = 0; i <= upperPyramidLines; i++) {
      for (int j = 0; j <= space; j++) {
        System.out.print(" ");
      }
      space--;
      for (int j = 0; j < i * 2 - 1; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }

    int lowerPyramidLines = lines/2;

    space = 0;
    for (int i = 0; i <= lowerPyramidLines; i++) {
      for (int j = 0; j < space; j++) {
        System.out.print(" ");
      }
      space++;
      for (int j = 0; j <  2 * (lowerPyramidLines - i) - 1; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
