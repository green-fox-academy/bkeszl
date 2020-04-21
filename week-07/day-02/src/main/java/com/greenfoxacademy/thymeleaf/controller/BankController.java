package com.greenfoxacademy.thymeleaf.controller;

import com.greenfoxacademy.thymeleaf.model.BankAccount;
import javax.print.DocFlavor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankController {

  @GetMapping(value = "/show")
  public String showAccount(Model model) {
    BankAccount oneAccount = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("account", oneAccount);
    return "index";
  }

  @GetMapping(value = "/htmlception")
  public String showHtmlCeption(Model model) {
    String htmlText = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("str", htmlText);
    return "ception";
  }
}
