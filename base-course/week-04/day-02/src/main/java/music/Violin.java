package main.java.music;

public class Violin extends StringedInstrument {
  String sound = "Screech";

  public Violin(int numberOfStrings, String sound) {
    super(numberOfStrings);
  }

  public Violin() {
    super();
    this.numberOfStrings = 4;
  }

  @Override
  public String sound() {
    return this.sound;
  }

  @Override
  public void play() {
    System.out.println("Violin, a " + this.numberOfStrings
        + "-stringed instrument that goes " + sound());
  }
}
