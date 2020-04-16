package com.greenfoxacademy.springstart.controllers;

import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FizzController {
  private int counter = 0;
  @RequestMapping("/web/fizz")
  public String greeting(Model model) {
    String str = "";
    counter++;
    if (counter % 3 == 0 && counter % 5 == 0 && counter % 7 == 0){
      str = "FizzBuzzWoof";
      model.addAttribute("fontSize", 72);
    } else if (counter % 3 == 0 && counter % 7 == 0) {
      str = "FizzWoof";
      model.addAttribute("fontSize", 48);
    } else if (counter % 3 == 0 && counter % 5 == 0){
      str = "FizzBuzz";
      model.addAttribute("fontSize", 48);
    } else if (counter % 5 == 0 && counter % 7 == 0){
      str = "BuzzWoof";
      model.addAttribute("fontSize", 48);
    } else if (counter % 3 == 0) {
      str = "Fizz";
      model.addAttribute("fontSize", 24);
    } else if (counter % 5 == 0) {
      str = "Buzz";
      model.addAttribute("fontSize", 24);
    } else if (counter % 7 == 0) {
      str = "Woof";
      model.addAttribute("fontSize", 24);
    } else {
      str = String.valueOf(counter);
      model.addAttribute("fontSize", 12);
    }
    model.addAttribute("string", str);
    return "fizz";
  }
}