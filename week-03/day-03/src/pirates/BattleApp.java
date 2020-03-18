package pirates;

public class BattleApp {
  public static void main(String[] args) {
    Ship oneShip = new Ship();
    oneShip.fillShip();
    Ship twoShip = new Ship();
    twoShip.fillShip();

    oneShip.battle(twoShip);
    oneShip.report();
    twoShip.report();
  }



}
