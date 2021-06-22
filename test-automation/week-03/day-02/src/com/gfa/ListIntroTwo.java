package com.gfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListIntroTwo {
  public static void main(String[] args) {
    ArrayList<String> listA = new ArrayList<>(Arrays.asList(
        "Apple",
        "Avocado",
        "Blueberries",
        "Durian",
        "Lychee"
    ));

    ArrayList<String> listB = new ArrayList<>(listA);

    System.out.println(listA.contains("Durian"));

    listB.remove("Durian");

    listA.add(4, "Kiwifruit");

    if (listA.size() > listB.size()) {
      System.out.println("A lista hoszabb");
    } else if (listA.size() < listB.size()) {
      System.out.println("B lista hoszabb");
    } else {
      System.out.println("Egyenloek");
    }

    System.out.println(listA.indexOf("Avocado"));

    System.out.println(listB.indexOf("Durian"));

    listB.addAll(Arrays.asList("Passion Fruit", "Pomelo"));

    //Collections.addAll(listB, "Pomelo", "Passion Fruit");

    System.out.println(listA.get(2));

    System.out.println(listB);
    System.out.println(listA);
  }
}
