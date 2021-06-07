package flyable;

public class Animal {
  int hunger;
  int thirst;
  boolean hasWings;

  public Animal() {
    this.hunger = 50;
    this.thirst = 50;
  }

  public void eat() {
    hunger--;
  }

  public void drink() {
    thirst--;
  }

  public void play() {
    hunger++;
    thirst++;
  }
}
