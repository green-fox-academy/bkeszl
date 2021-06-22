package com.gfa;


public class TakesLonger {
  public static void main(String... args) {
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    // When saving this quote a disk error has occurred. Please fix it!
    // Insert the words "always takes longer than" between the words "It" and "you" using the StringBuilder class!
    // Use pieces of the quote variable (instead of just redefining the string)!

    StringBuilder sb = new StringBuilder(quote);
    sb.insert(20, " always takes longer than");

    String subQuote1 = quote.substring(0, 20);
    String subQuote2 = " always takes longer than";
    String subQuote3 = quote.substring(20);

    StringBuilder sb2 = new StringBuilder();

    quote = sb2.append(subQuote1).append(subQuote2).append(subQuote3).toString();

    System.out.println(quote);
  }
}
