package com.greenfoxacademy.dependencyinjection.coloring;

import com.greenfoxacademy.dependencyinjection.hellodi.model.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YellowColor implements MyColor {
  private Printer printer;

  @Override
  public void printColor() {
    printer.log("It is yellow in color...");
  }
  @Autowired
  YellowColor(Printer printer) {
    this.printer = printer;
  }
}
