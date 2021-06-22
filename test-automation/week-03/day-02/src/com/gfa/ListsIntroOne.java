package com.gfa;

import java.util.ArrayList;

public class ListsIntroOne {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();

    System.out.println(names.size());

    names.add("William");

    System.out.println(names.isEmpty());

    names.add("John");
    names.add("Amanda");

    System.out.println(names.size());

    System.out.println(names.get(2));

    System.out.println("----------");

    for (String name : names){
      System.out.println(name);
    }

    for (int i = 0; i < names.size(); i++) {
      System.out.println((i + 1) + ". "  + names.get(i));
    }

    names.remove(1);

    for (String name : names){
      System.out.println(name);
    }

    System.out.println("Reversed: ");

    for (int i = names.size() - 1; i >=0; i--) {
      System.out.println(names.get(i));
    }

    System.out.println(names);

    names.clear();

    System.out.println(names);
  }
}
