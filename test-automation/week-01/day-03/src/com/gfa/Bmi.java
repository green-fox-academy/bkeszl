package com.gfa;

public class Bmi {
  public static void main(String[] args) {
    double massInKg = 81.2;
    double heightInM = 1.78;

    // Print the Body mass index (BMI) based on these values
    double bmi = massInKg / (heightInM * heightInM);
    System.out.println("Bmi with multiplication: " + bmi);

    double bmiWithMathPow = massInKg / Math.pow(heightInM, 2);
    System.out.println("Bmi with Math.pow(): " + bmi);
  }
}
