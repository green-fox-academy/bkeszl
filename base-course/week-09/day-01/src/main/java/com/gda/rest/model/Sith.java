package com.gda.rest.model;

public class Sith {
  private String text;

  public Sith(String text) {
    this.text = text;
  }

  public Sith() {
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
