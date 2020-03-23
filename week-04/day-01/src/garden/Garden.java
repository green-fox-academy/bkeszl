package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> plants = new ArrayList<>();

  public void watering(double waterSumm) {
    System.out.println("Watering with " + waterSumm);
    List<Plant> needsWater = new ArrayList<>();
    for (Plant value : plants) {
      if (value.waterLevel < value.waterThreshold) {
        needsWater.add(value);
      }
    }

    for (Plant plant : needsWater) {
      plant.waterPlant(waterSumm/needsWater.size());
    }
    report();
  }

  public void report() {
    for (Plant plant : plants) {
      plant.report();
    }
  }
}
