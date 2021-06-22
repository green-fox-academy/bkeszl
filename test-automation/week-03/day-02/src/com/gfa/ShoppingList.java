package com.gfa;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
  public static void main(String[] args) {
    ArrayList<String> shoppingList =
        new ArrayList<>(Arrays.asList("Eggs", "Milk", "Fish", "Apples", "Bread", "Chicken"));

    System.out.println(shoppingList.contains("Milk"));
    System.out.println(shoppingList.contains("Bananas"));
  }
}
