package com.greenfoxacademy.dependencyinjection.utilities.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityServiceController {
  private UtilityService utilityService;

  @Autowired
  public UtilityServiceController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("/useful")
  public String showUseful() {
    return "useful";
  }
  @GetMapping("/useful/colored")
  public String showUtil1(Model model) {
    model.addAttribute("randomColor", utilityService.randomColor());
    return "colored";
  }
  @GetMapping("/useful/email")
  public String showUtil2(@RequestParam String email, Model model) {
    model.addAttribute("valid", utilityService.validEmail(email));
    model.addAttribute("query", email);
    return "email";
  }
  @GetMapping("/useful/cesarencode")
  public String showUtil3(@RequestParam String text, @RequestParam String number, Model model) {
    model.addAttribute("encodedText", utilityService.caesar(text, Integer.parseInt(number)));
    return "cesar";
  }
  @GetMapping("/useful/cesardecode")
  public String showUtil4(@RequestParam String text, @RequestParam String number, Model model) {
    model.addAttribute("encodedText", utilityService.caesar(text, -Integer.parseInt(number)));
    return "cesar";
  }
}
