package com.gda.rest.model;

public class DoUntillRequest {
  private Integer until;

  public DoUntillRequest(Integer until) {
    this.until = until;
  }

  public DoUntillRequest() {
  }

  public Integer getUntil() {
    return until;
  }

  public void setUntil(Integer until) {
    this.until = until;
  }
}
