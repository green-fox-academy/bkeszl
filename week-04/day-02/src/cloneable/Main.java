package cloneable;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) throws CloneNotSupportedException {
   Student john = new Student("John", 20, "Male", "BME");
   Student johnTheClone = (Student) john.clone();
    System.out.println(johnTheClone.getAge());
  }
}
