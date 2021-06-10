package com.gfa;

import java.awt.SystemTray;
import java.util.Scanner;

public class PrintBigger {
  public static void main(String[] args) {
    // Write a program that asks for two numbers and prints the bigger one

    Scanner sc = new Scanner(System.in);

    int numOne = sc.nextInt();
    int numTwo = sc.nextInt();

    System.out.println(Math.max(numOne, numTwo));
  }
}