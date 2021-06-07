package com.gda.rest.model;

public class DoUntill {
  private Integer result;

  public DoUntill(Integer result, String action) {
    if (action.equals("factor")) {
      int fact = 1;
      for (int i = 2; i <= result; i++) {
        fact = fact * i;
      }
      this.result = fact;
    }
    if (action.equals("sum")) {
      int sum = 0;
      for (int i = 0; i <= result; i++) {
        sum = sum + i;
      }
      this.result = sum;
    }
  }

  public DoUntill(){}

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}
