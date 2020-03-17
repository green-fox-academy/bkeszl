package animal;

public class Animal {
  int hunger;
  int thirst;

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

  public static void main(String[] args) {
    Animal kakadoo = new Animal();
    kakadoo.play();
    kakadoo.drink();
    System.out.println(kakadoo.hunger + kakadoo.thirst);
  }
}
