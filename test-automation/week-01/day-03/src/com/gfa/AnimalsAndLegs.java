package com.gfa;

import java.util.Scanner;

public class AnimalsAndLegs {
  public static void main(String[] args) {
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The second represents the number of pigs owned by the farmer
    // It should print how many legs all the animals have

    int chicken = 0;
    int pig = 0;

    Scanner sc = new Scanner(System.in);

    System.out.println("How many chicken does the farmer have?: ");
    chicken = sc.nextInt();
    System.out.println("How many pigs does the farmer have?: ");
    pig = sc.nextInt();

    System.out.println("Nr. of legs on the farm: " + (chicken * 2 + pig * 4));
  }
}
