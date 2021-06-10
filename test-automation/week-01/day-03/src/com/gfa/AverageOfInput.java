package com.gfa;

import java.util.Scanner;

public class AverageOfInput {
  public static void main(String[] args) {
    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    //
    // Sum: 22, Average: 4.4

    int one = 0;
    int two = 0;
    int three = 0;
    int four = 0;
    int five = 0;

    Scanner sc = new Scanner(System.in);

    one = sc.nextInt();
    two = sc.nextInt();
    three = sc.nextInt();
    four = sc.nextInt();
    five = sc.nextInt();

    int sum = one + two + three + four + five;

    System.out.println("Sum: " + sum);

    System.out.println("Avearage: " + sum / 5);
  }
}
