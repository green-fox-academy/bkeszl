package flyable;

public class Bird extends Animal implements Flyable {

  public Bird() {
    super();
    this.hasWings = true;
  }

  @Override
  public void fly() {
    System.out.println(getClass().getSimpleName() + " is flying" + (this.hasWings ?  " on wings..." : "..."));
  }

  @Override
  public void land() {
    System.out.println(getClass().getSimpleName() + " is landing...");

  }

  @Override
  public void takeOff() {
    System.out.println(getClass().getSimpleName() + " is taking off...");
  }
}
