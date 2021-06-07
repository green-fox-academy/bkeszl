package garden;

public class Flower extends Plant {
  public Flower(String color) {
    super(color);
    super.setWaterMultiplier(0.75);
    super.setWaterThreshold(5);
  }
}
