package com.greenfoxacademy.thymeleaf.controller;

import com.greenfoxacademy.thymeleaf.model.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankController {

  @GetMapping(value = "/show")
  public String showAccount(Model model) {
    BankAccount oneAccount = new BankAccount("Simba", 2000, "lion", false);
    model.addAttribute("account", oneAccount);
    return "index";
  }

  @GetMapping(value = "/htmlception")
  public String showHtmlCeption(Model model) {
    String htmlText = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("str", htmlText);
    return "ception";
  }

  @GetMapping(value = "/")
  public String showBank(Model model) {
    List<BankAccount> accounts = new ArrayList<>();
    String crownIcon = "<i class=\"fas fa-crown\"></i>";
    accounts.add(new BankAccount("Simba", 2000, "lion", true));
    accounts.add(new BankAccount("Scar", 15000, "lion", false));
    accounts.add(new BankAccount("Mufasa", 0, "lion", true));
    accounts.add(new BankAccount("Nala", 7500, "lion", false));
    accounts.add(new BankAccount("Shenzi", 500, "hyena", false));
    model.addAttribute("accounts", accounts);
    model.addAttribute("crown", crownIcon);
    return "index";
  }
}
