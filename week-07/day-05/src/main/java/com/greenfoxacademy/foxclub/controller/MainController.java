package com.greenfoxacademy.foxclub.controller;

import com.greenfoxacademy.foxclub.model.Fox;
import com.greenfoxacademy.foxclub.model.FoxStarterTricks;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
  private List<String> foods = new ArrayList<>();
  private List<String> drinks = new ArrayList<>();
  private List<String> tricks = new FoxStarterTricks().getTricks();
  private List<Fox> foxes = new ArrayList<>();

  public MainController() {
    foxes.add(new Fox("D'gvaaan", "ribs", "orange drink"));
    foxes.add(new Fox("Sven", "foie de gras", "apple juice"));
    foxes.add(new Fox("Angie", "salad", "coconut water"));
    foods.add("ribs");
    foods.add("foie de gras");
    foods.add("salad");
    drinks.add("orange drink");
    drinks.add("apple juice");
    drinks.add("coconut water");
    tricks.add("implement Springboot");
    tricks.add("inject dependencies");
  }

  @GetMapping("/")
  public String renderHome() {
    return "index";
  }

  @GetMapping("/login")
  public String renderLogin() {
    return "login";
  }

  @PostMapping("/login")
  public String renderLogin(@RequestParam String name, RedirectAttributes redirectAttributes) {
    redirectAttributes.addAttribute("name", name);
    if (name.equals("")) {
      return "login";
    }
    return "redirect:/info";
  }

  @GetMapping("/info")
  public String renderSingleFox(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    //Assuming there are no name duplicates
    Fox singleFox = foxes.stream()
        .filter(fox -> fox.getName().equals(name))
        .collect(Collectors.toList())
        .get(0);
    model.addAttribute("fox", singleFox);
    return "info";
  }

  @GetMapping("/nutritionstore")
  public String renderNutritionStore(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    //Assuming there are no name duplicates
    Fox singleFox = foxes.stream()
        .filter(fox -> fox.getName().equals(name))
        .collect(Collectors.toList())
        .get(0);
    model.addAttribute("fox", singleFox);
    model.addAttribute("foods", foods);
    model.addAttribute("drinks", drinks);
    return "nstore";
  }

  @PostMapping("/nutritionstore")
  public String changeNutrition(@RequestParam String name, Model model, @RequestParam String food,
                                @RequestParam String drink, RedirectAttributes redirectAttributes) {
    redirectAttributes.addAttribute("name", name);
    Fox singleFox = foxes.stream()
        .filter(fox -> fox.getName().equals(name))
        .collect(Collectors.toList())
        .get(0);
    singleFox.setDrink(drink);
    singleFox.setFood(food);
    return "redirect:/info";
  }

  @GetMapping("/trickcenter")
  public String renderTrickCenter(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    //Assuming there are no name duplicates
    Fox singleFox = foxes.stream()
        .filter(fox -> fox.getName().equals(name))
        .collect(Collectors.toList())
        .get(0);
    model.addAttribute("fox", singleFox);
    model.addAttribute("tricks", tricks);
    return "trickcenter";
  }

  @PostMapping("/trickcenter")
  public String changeNutrition(@RequestParam String name, Model model, @RequestParam String trick,
                                RedirectAttributes redirectAttributes) {

    redirectAttributes.addAttribute("name", name);
    Fox singleFox = foxes.stream()
        .filter(fox -> fox.getName().equals(name))
        .collect(Collectors.toList())
        .get(0);

    List<String> trickList = singleFox.getTricks();
    trickList.add(trick);
    singleFox.setTricks(trickList);

    return "redirect:/info";
  }
}
