package com.gfa;

import java.util.Scanner;

public class PartyIndicator {
  public static void main(String[] args) {
    // Write a program that asks for two numbers
    // The first number represents the number of girls that comes to a party, the
    // second represents the number of boys
    //
    // If the the number of girls and boys are equal and 20 or more people are coming to the party
    // it should print: The party is excellent!
    //
    // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
    // it should print: Quite a cool party!
    //
    // If there are less people coming than 20
    // it should print: Average party...
    //
    // If no girls are coming, regardless the count of the people
    // it should print: Sausage party

    Scanner sc = new Scanner(System.in);

    System.out.print("How many girls came to the party?: ");
    int girls = sc.nextInt();

    while (girls < 0) {
      System.out.println("Please set  0 or positive number of girls: ");
      girls = sc.nextInt();
    }

    System.out.print("How many boys came to the party?: ");
    int boys = sc.nextInt();


    int guests = girls + boys;
    boolean guestsMoreThanTwenty = guests >= 20;


    if (girls == boys && guestsMoreThanTwenty) {
      System.out.println("The party is excellent");
    }

    if ((guestsMoreThanTwenty && girls != boys) && girls >= 1) {
      System.out.println("Quite a cool party");
    }

    if (guests < 20 && girls >= 1) {
      System.out.println("Average party...");
    }

    if (girls == 0) {
      System.out.println("Sausage party");
    }
  }
}