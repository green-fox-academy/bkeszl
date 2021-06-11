package com.gfa;

public class DrawChessTable {
  // Crate a program that draws a chess table like this
  //
  // % % % %
  //  % % % %
  // % % % %
  //  % % % %
  // % % % %
  //  % % % %
  // % % % %
  //  % % % %
  //

  public static void main(String[] args) {
    char mod = '%';
    int lineCount = 0;

    for (int i = 1; i < 65; i++) {
      if (i % 2 == 0) {
        if (lineCount % 2 == 0) {
          System.out.print(mod);
        } else {
          System.out.print(" ");
        }
      } else {
        if (lineCount % 2 == 1) {
          System.out.print(mod);
        } else {
          System.out.print(" ");
        }
      }

      if (i % 8 == 0) {
        System.out.println("");
        lineCount++;
      }
    }
  }
}
