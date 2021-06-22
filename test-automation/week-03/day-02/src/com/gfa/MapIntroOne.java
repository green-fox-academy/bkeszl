package com.gfa;

import java.util.HashMap;

public class MapIntroOne {
  public static void main(String[] args) {
    HashMap<Integer, Character> characterToIntMap = new HashMap<>();

    System.out.println(characterToIntMap.isEmpty());

    characterToIntMap = new HashMap<Integer, Character>(){{
      put(97, 'a');
      put(98, 'b');
      put(99, 'c');
      put(65, 'A');
      put(66, 'B');
      put(67, 'C');
    }};


    System.out.println(characterToIntMap.keySet());

    System.out.println(characterToIntMap.values());

    characterToIntMap.put(68, 'D');

    System.out.println(characterToIntMap.size());

    System.out.println(characterToIntMap.get(99));

    characterToIntMap.remove(97);

    System.out.println(characterToIntMap.size());

    System.out.println(characterToIntMap.containsKey(100));

    characterToIntMap.clear();

    System.out.println(characterToIntMap.size());
  }
}
