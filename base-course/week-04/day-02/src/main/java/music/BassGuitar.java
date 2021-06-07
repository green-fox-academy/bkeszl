package main.java.music;

public class BassGuitar extends StringedInstrument {
  String sound = "Duum-duum-duum";

  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings);
  }

  public BassGuitar() {
    super();
    this.numberOfStrings = 4;
  }

  @Override
  public String sound() {
    return this.sound;
  }

  @Override
  public void play() {
    System.out.println("Bass Guitar, a " + this.numberOfStrings
        + "-stringed instrument that goes " + sound());
  }
}
