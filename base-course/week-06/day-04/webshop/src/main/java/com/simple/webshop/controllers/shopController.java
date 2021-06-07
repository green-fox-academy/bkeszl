package com.simple.webshop.controllers;

import com.simple.webshop.ShopItem;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class shopController {
  private List<ShopItem> storeItems;
  public shopController() {
    this.storeItems = new ArrayList<>();
    this.storeItems.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000, 5));
    this.storeItems.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000, 2));
    this.storeItems.add(new ShopItem("Coca cola", "0,5L standard coke", 25, 0));
    this.storeItems.add(new ShopItem("Wokin", "Chicken fried rice and WOKIN sauce", 119, 100));
    this.storeItems.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300, 1));
  }

  @RequestMapping("/shop")
  public String shop(Model model) {
    model.addAttribute("items", storeItems);
    return "shop";
  }

  @RequestMapping("/only-available")
  public String onlyshop(Model model) {
    List<ShopItem> filtered;
    filtered = storeItems.stream().filter(shopItem -> shopItem.getStockQuantity() != 0).collect(Collectors.toList());
    model.addAttribute("items", filtered);
    return "shop";
  }

  @RequestMapping("/cheapest-first")
  public String cheapskate(Model model) {
    List<ShopItem> filtered;
    filtered = storeItems.stream().sorted(Comparator.comparingDouble(ShopItem::getPrice)).collect(Collectors.toList());
    model.addAttribute("items", filtered);
    return "shop";
  }

  @RequestMapping("/contains-nike")
  public String nike(Model model) {
    List<ShopItem> filtered;
    filtered = storeItems.stream().filter(shopItem -> shopItem.getName().contains("Nike") || shopItem.getDescription().contains("Nike")).collect(Collectors.toList());
    model.addAttribute("items", filtered);
    return "shop";
  }

  @RequestMapping("/average-stock")
  public String average(Model model) {
    double avgStock;
    avgStock = storeItems.stream().mapToDouble(ShopItem::getStockQuantity).average().getAsDouble();
    String information = "Average stock: " + avgStock;
    model.addAttribute("information", information);
    return "info";
  }

  @RequestMapping("/most-expensive")
  public String mostExp(Model model) {
    String filtered;
    filtered = storeItems.stream().max(Comparator.comparingDouble(ShopItem::getPrice)).get().getName();
    model.addAttribute("information", filtered);
    return "info";
  }

  @RequestMapping("/search")
  @PostMapping
  public String search(@RequestBody String str , Model model) {
    List<ShopItem> filtered;
    String query = str.substring(7);
    filtered = storeItems.stream().filter(shopItem -> shopItem.getName().contains(query) || shopItem.getDescription().contains(query)).collect(Collectors.toList());
    model.addAttribute("items", filtered);
    return "shop";
  }
}
