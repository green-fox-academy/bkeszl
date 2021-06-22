package com.gfa;

import java.util.HashMap;
import java.util.Map;

public class MapIntoTwo {
  public static void main(String[] args) {
    HashMap<String, String> books = new HashMap<String, String>() {{
      put("978-1-60309-452-8", "A Letter to Jo");
      put("978-1-60309-459-7", "Lupus");
      put("978-1-60309-444-3", "Red Panda and Moon Bear");
      put("978-1-60309-461-0", "The Lab");
    }};


    books.remove("978-1-60309-444-3");

    for (Map.Entry<String, String> entry : books.entrySet()) {
      if (entry.getValue().equals("The Lab")) {
        books.remove(entry.getKey());
      }
    }

    books.putAll(new HashMap<String, String>() {{
      put("978-1-60309-450-4", "They Called Us Enemy");
      put("978-1-60309-453-5", "Why Did We Trust Him?");
    }});

    for (Map.Entry<String, String> entry : books.entrySet()) {
      System.out.println(entry.getValue() + " (ISBN: " + entry.getKey() + ")");
    }

    System.out.println(books.containsKey("478-0-61159-424-8"));

    System.out.println(books.get("978-1-60309-453-5"));
  }
}
