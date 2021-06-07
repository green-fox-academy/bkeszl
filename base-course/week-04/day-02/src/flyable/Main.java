package flyable;

public class Main {
  public static void main(String[] args) {
    Flyable helicopter = new Helicopter();
    helicopter.fly();
    Flyable bird = new Bird();
    bird.fly();
  }
}
