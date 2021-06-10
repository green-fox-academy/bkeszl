package com.gfa;

public class CodingHours {
  public static void main(String[] args) {
    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long
    int dailyHours = 6;
    int weeks = 17;

    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    int workDays = 5;

    System.out.println("Hours spent coding in a semester: " + dailyHours * workDays * weeks);

    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52

    double weeklyWorkHours = 52;
    double weeklyCodingHours = dailyHours * workDays;

    System.out.println(weeklyCodingHours / weeklyWorkHours * 100 + "%");
  }
}
