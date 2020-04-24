package com.greenfoxacademy.foxclub.model;

import java.util.ArrayList;
import java.util.List;

public class FoxStarterTricks {
  private List<String> tricks = new ArrayList<>();

  public FoxStarterTricks() {
    this.tricks.add("writes HTML");
    this.tricks.add("codes in Java");
  }

  public List<String> getTricks() {
    return tricks;
  }
}
