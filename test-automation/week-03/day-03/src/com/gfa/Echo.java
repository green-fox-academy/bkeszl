package com.gfa;

public class Echo {
  public static void main(String[] args)  {
    echo("Valami");
    echo(null);
  }

  public static void echo(String toEcho) {
    if (toEcho == null) {
      System.out.println("the string should not be null");
      return;
    }
    System.out.println(toEcho + " " + toEcho);
  }
}
