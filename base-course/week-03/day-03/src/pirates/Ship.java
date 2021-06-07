package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  List<Pirate> crew ;
  Pirate captain;
  int deadCrew;
  int passedOutCrew;
  int aliveCrew;
  Random randomGenerator = new Random();

  public void fillShip() {
    this.captain = new Pirate();
    this.crew =new ArrayList<>();
    int random = randomGenerator.nextInt(5) +1;
    for (int i = 0; i < random; i++) {
      crew.add(new Pirate());
    }
  }

  public void report() {
    for (int i = 0; i <this.crew.size() ; i++) {
      if (crew.get(i).isDead) {
        this.deadCrew++;
      }
      if (crew.get(i).isPassedOut) {
        this.passedOutCrew++;
      }

    }
    System.out.println("[ Cpt.Rum consumed: " + this.captain.intoxicationLevel + " Cpt. is: " + this.captain.checkState() +
        " Passed out: " + this.passedOutCrew + " Dead: " + this.deadCrew + " Alive: " + aliveCrew + " ]");
  }

  public int calculateScore() {
    int score = 0;
    this.aliveCrew = (this.crew.size() - this.deadCrew) - this.passedOutCrew;
    score = this.aliveCrew - this.captain.intoxicationLevel;
    return score;
  }

  public boolean battle(Ship otherShip) {
    int randomDeaths = randomGenerator.nextInt(15) + 1;
    if (otherShip.calculateScore() < this.calculateScore()) {
      for (int i = 0; (i < randomDeaths) && (i < otherShip.crew.size()); i++) {
        otherShip.crew.get(i).die();
        this.haveParty();
      }

      return true;
    } else {
      for (int i = 0; (i < randomDeaths) && (i < this.crew.size()); i++) {
        this.crew.get(i).die();
        otherShip.haveParty();
      }
      return false;
    }
  }
  public void haveParty() {
    int captainDrinks = randomGenerator.nextInt(5);
    for (int i = 0; i <captainDrinks ; i++) {
      this.captain.howsItGoingMate();
    }
    for (int i = 0; i <this.crew.size() ; i++) {
      int crewMemberDrinks = randomGenerator.nextInt(5);
      for (int j = 0; j <crewMemberDrinks ; j++) {
        this.crew.get(i).howsItGoingMate();
      }
    }
  }
}
