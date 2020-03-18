package pirates;

import java.util.Random;

public class Pirate {
  int intoxicationLevel;
  boolean isPassedOut;
  boolean isDead;
  String state;

  public void drinkSomeRum() {
    this.intoxicationLevel++;
  }

  public void howsItGoingMate() {
    if (isDead) {
      System.out.println("he's dead");
      return;
    }

    if (this.intoxicationLevel < 5) {
      System.out.println("Pour me anudder!");
      drinkSomeRum();
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      this.isPassedOut = true;
    }
  }
  public void die() {
    this.isDead = true;
    this.isPassedOut = false;
  }

  public void brawl(Pirate otherPirate) {
    Random whatHappens = new Random();
    int random = whatHappens.nextInt(3) +1;
    switch (random){
      case 1:
        this.die();
        break;
      case 2:
        otherPirate.die();
        break;
      case 3:
        this.isPassedOut = true;
        otherPirate.isPassedOut =true;
        break;
    }
    //parrot
  }

  public String checkState(){
    state = "Alive and well";
    if (isPassedOut){
      this.state = "passed out";
    }
    if (isDead) {
      this.state ="dead";
    }
    return state;
  }
}
