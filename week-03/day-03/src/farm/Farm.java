package farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
  int slots = 8;
  List<Animal> listOfAnimals = new ArrayList<>();


  public void breed() {
    for (int i = 0; i < slots; i++) {
      if (listOfAnimals.size() < slots) {
        Animal newAnimal = new Animal();
        listOfAnimals.add(newAnimal);
      }
    }
  }
  public void slaughter() {
    int leastHungryIndex = 0;
    for (int i = 0; i < slots; i++) {
      if (leastHungryIndex < listOfAnimals.get(i).hunger){
        leastHungryIndex = i;
      }
    }
    listOfAnimals.remove(leastHungryIndex);
  }
}
