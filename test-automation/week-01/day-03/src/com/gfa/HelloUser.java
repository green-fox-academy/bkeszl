package com.gfa;

import java.util.Scanner;

public class HelloUser {
  public static void main(String[] args) {
    // Modify this program to greet the User instead of the World!
    // The program should ask for the name of the User
    String user = "";
    Scanner sc = new Scanner(System.in);

    user = sc.nextLine();

    System.out.println("Hello, " + user + "!");
  }
}
