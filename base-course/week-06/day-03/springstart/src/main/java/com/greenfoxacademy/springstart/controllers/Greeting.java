package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
  private AtomicLong greetCount;
  private String content;

  public AtomicLong getGreetCount() {
    return this.greetCount;
  }

  public String getContent() {
    return this.content;
  }

  public void setGreetCount(AtomicLong greetCount) {
    this.greetCount = greetCount;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Greeting(String content) {
    this.greetCount = new AtomicLong(0);
    this.content = content;
  }
}
