package flyable;

public class Helicopter extends Vehicle implements Flyable {

  public Helicopter() {
    super();
    this.hasWings = false;
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
