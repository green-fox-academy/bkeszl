package com.greenfoxacademy.dependencyinjection;

import com.greenfoxacademy.dependencyinjection.coloring.MyColor;
import com.greenfoxacademy.dependencyinjection.hellodi.model.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyinjectionApplication implements CommandLineRunner {

  private Printer printer;
  private MyColor myColor;

  @Autowired
  DependencyinjectionApplication(Printer printer, @Qualifier("redColor") MyColor myColor) {
    this.printer = printer;
    this.myColor = myColor;
  }

  public static void main(String[] args) {
    SpringApplication.run(DependencyinjectionApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    myColor.printColor();
  }
}
