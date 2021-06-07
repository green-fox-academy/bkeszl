package garden;

public class Tree extends Plant {
  public Tree(String color) {
    super(color);
    super.setWaterMultiplier(0.4);
    super.setWaterThreshold(10);
  }
}
