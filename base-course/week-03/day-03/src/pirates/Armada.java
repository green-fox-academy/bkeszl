package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Armada {
  List<Ship> armadaShipsList = new ArrayList<>();

  public Armada() {
    Random newShipGenerator = new Random();
    int newShipAmount = newShipGenerator.nextInt(15)+10;

    for (int i = 0; i < newShipAmount; i++) {
      this.armadaShipsList.add(i, new Ship());
      this.armadaShipsList.get(i).fillShip();
    }
  }


  public boolean war(Armada otherArmada) {
    while (this.armadaShipsList.size() != 0 && otherArmada.armadaShipsList.size() != 0) {
      System.out.println("A ship is battling another");
      if (this.armadaShipsList.get(0).battle(otherArmada.armadaShipsList.get(0))) {
        otherArmada.armadaShipsList.remove(0);
        this.armadaShipsList.get(0).report();
      } else {
        this.armadaShipsList.remove(0);
        otherArmada.armadaShipsList.get(0).report();
      }
    }
    if (this.armadaShipsList.size() != 0) {
      return true;
    } else {
      return false;
    }
  }
}
