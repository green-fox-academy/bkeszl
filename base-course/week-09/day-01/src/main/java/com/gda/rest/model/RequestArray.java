package com.gda.rest.model;

public class RequestArray {
  private String what;
  private Integer[] numbers;

  public RequestArray(String what, Integer[] numbers) {
    this.what = what;
    this.numbers = numbers;
  }

  public RequestArray(){}

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public Integer[] getNumbers() {
    return numbers;
  }

  public void setNumbers(Integer[] numbers) {
    this.numbers = numbers;
  }
}
