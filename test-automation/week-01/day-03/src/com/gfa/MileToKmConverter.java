package com.gfa;

import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    // Write a program that asks for a double that is a distance in miles,
    // then it converts that value to kilometers and prints it

    Scanner sc = new Scanner(System.in);
    System.out.print("Give me Miles, Spiderman: ");
    double miles = sc.nextDouble();

    System.out.println(miles * 1.60934);
  }
}
