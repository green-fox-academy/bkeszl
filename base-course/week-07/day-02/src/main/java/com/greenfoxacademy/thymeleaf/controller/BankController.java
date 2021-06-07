package com.greenfoxacademy.thymeleaf.controller;

import com.greenfoxacademy.thymeleaf.model.BankAccount;
import com.sun.jdi.IntegerValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BankController {

  List<BankAccount> accounts = new ArrayList<>();

  public BankController() {
    accounts.add(new BankAccount("Simba", 2000, "lion", true, "Good One"));
    accounts.add(new BankAccount("Scar", 15000, "lion", false, "Bad One"));
    accounts.add(new BankAccount("Mufasa", 0, "lion", true, "Good One"));
    accounts.add(new BankAccount("Nala", 7500, "lion", false, "Good One"));
    accounts.add(new BankAccount("Shenzi", 500, "hyena", false, "Bad One"));
  }

  @GetMapping(value = "/show")
  public String showAccount(Model model) {
    BankAccount oneAccount = new BankAccount("Simba", 2000, "lion", false, "Good One");
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
    String crownIcon = "<i class=\"fas fa-crown\"></i>";
    model.addAttribute("accounts", accounts);
    model.addAttribute("crown", crownIcon);
    return "index";
  }

  @PostMapping(value = "/increment")
  public String incrementAnimal(@RequestParam String name) {
    List<BankAccount> incremented = accounts.stream()
        .filter(account -> account.getName().equals(name))
        .collect(Collectors.toList());
    if (incremented.get(0).getIsKing()) {
      incremented.get(0).setBalance(incremented.get(0).getBalance() + 100);
    } else {
      incremented.get(0).setBalance(incremented.get(0).getBalance() + 10);
    }
    return "redirect:/";
  }

  @PostMapping(value = "/addacount")
  public String addAccount(@RequestParam Map<String, String> params) {
    boolean kingStatus = false;
    if (params.get("isKing").equals("on")) {
      kingStatus = true;
    }
    accounts.add(new BankAccount(params.get("name"), Integer.parseInt(params.get("balance")), params.get("animalType"), kingStatus, params.get("alignment") ));
    return "redirect:/";
  }
}
