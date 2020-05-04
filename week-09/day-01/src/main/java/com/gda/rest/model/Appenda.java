package com.gda.rest.model;

public class Appenda {
  private String appended;

  public Appenda(String input){
    this.appended = input + "a";
  }

  public Appenda(){

  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
