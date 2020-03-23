package garden;

public class Plant {
  String color;
  double waterLevel;
  double waterThreshold;
  double waterMultiplier;

  public void report() {
    if (this.waterLevel < waterThreshold) {
      System.out.println("The " + this.color + " " + getClass().getSimpleName() + " needs water.");
    } else {
      System.out.println("The " + this.color + " " + getClass().getSimpleName() + " doesn't need water.");
    }
  }

  public void waterPlant(double waterWith) {
    this.waterLevel += (waterWith * waterMultiplier);
  }

  public Plant(String color) {
    this.color = color;
  }

  public double getWaterLevel() {
    return waterLevel;
  }

  public void setWaterLevel(double waterLevel) {
    this.waterLevel = waterLevel;
  }

  public double getWaterThreshold() {
    return waterThreshold;
  }

  public void setWaterThreshold(double waterThreshold) {
    this.waterThreshold = waterThreshold;
  }

  public double getWaterMultiplier() {
    return waterMultiplier;
  }

  public void setWaterMultiplier(double waterMultiplier) {
    this.waterMultiplier = waterMultiplier;
  }
}
