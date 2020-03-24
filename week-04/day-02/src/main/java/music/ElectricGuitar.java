package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  String sound = "Twang";

  public ElectricGuitar(int numberOfStrings) {
    super(numberOfStrings);
  }

  public ElectricGuitar() {
    super();
    this.numberOfStrings = 6;
  }
  @Override
  public String sound() {
    return this.sound;
  }

  @Override
  public void play() {
    System.out.println("Electric Guitar, a " + this.numberOfStrings
        + "-stringed instrument that goes " + sound() );
  }
}
