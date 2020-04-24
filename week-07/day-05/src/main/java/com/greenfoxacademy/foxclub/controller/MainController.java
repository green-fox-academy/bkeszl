package com.greenfoxacademy.foxclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
  @GetMapping("/")
  public String renderHome() {
    return "index";
  }
}
