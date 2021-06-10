package com.gfa;

public class TwoNumbers {
  public static void main(String[] args) {
    // Create a program that prints a few operations on two numbers: 22 and 13
    double numOne = 22.0;
    double numTwo = 13.0;

    System.out.println("Print the result of 13 added to 22");
    System.out.println(numOne + numTwo);

    System.out.println("Print the result of 13 substracted from 22");
    System.out.println(numOne - numTwo);

    System.out.println("Print the result of 22 multiplied by 13");
    System.out.println(numOne * numTwo);

    System.out.println("Print the result of 22 divided by 13 (as a decimal fraction)");
    System.out.println(numOne / numTwo);

    System.out.println("Print the integer part of 22 divided by 13");
    System.out.println((int) (numOne / numTwo));

    System.out.println("Print the remainder of 22 divided by 13");
    System.out.println(numOne % numTwo);

  }
}
