package com.gfa;

public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;

    int remaining = 60 * 60 * 24;

    int elapsed = currentSeconds + currentMinutes * 60 + currentHours * 3600;

    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented by the variables above

    System.out.println(remaining - elapsed);
  }
}
