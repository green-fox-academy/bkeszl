package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
  Greeting greet1 = new Greeting("urmomgay");
  @RequestMapping(value="/greeting", method = RequestMethod.GET)
  public Greeting greeting(@RequestParam String name) {
    greet1.setContent("Hello, " + name);
    greet1.setGreetCount(new AtomicLong(greet1.getGreetCount().longValue() + 1));
    return greet1;
  }
}
