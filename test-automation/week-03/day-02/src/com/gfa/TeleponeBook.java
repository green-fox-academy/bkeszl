package com.gfa;

import java.util.HashMap;
import java.util.Map;

public class TeleponeBook {
  public static void main(String[] args) {
    HashMap<String, String> contacts = new HashMap<String, String>(){{
      put("William A. Lathan", "405-709-1865");
      put("John K. Miller", "402-247-8568");
      put("Hortensia E. Foster", "606-481-6467");
      put("Amanda D. Newland", "319-243-5613");
      put("Brooke P. Askew", "307-687-2982");
    }};

    System.out.println(contacts.get("John K. Miller"));

    for(Map.Entry<String, String> entry : contacts.entrySet()){
      if (entry.getValue().equals("307-687-2982")) {
        System.out.println(entry.getKey());
      }
    }

    System.out.println(contacts.containsKey("Chris E. Myers"));
  }
}
