package cowsandbulls;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {

  Random random = new Random();
  int randomInt = random.nextInt(10000);
  boolean isFinished;
  int countGuesses;

  public String randomNumberGenerator() {
    //make it a string and add the leading 0s
    return String.format("%04d", this.randomInt);
  }

  public String userGuess() {
    System.out.print("Guess a number: ");
    Scanner scanner = new Scanner(System.in);
    this.countGuesses++;
    return scanner.next();
  }

  public void gameLoopContents(String targetString, String userGuess) {
    //Compare our two strings
    int cowCounter = 0;
    int bullCounter = 0;

    for (int i = 0; i < targetString.length() ; i++) {
      if (targetString.charAt(i) == userGuess.charAt(i)) {
        cowCounter++;
      } else if ((userGuess.indexOf(targetString.charAt(i))!= -1) ) {
        bullCounter++;
      }
    }

    //print result
    if (cowCounter == 4) {
      System.out.println("Congratulations, you guessed Right!");
      this.isFinished = true;
    }

    System.out.println(cowCounter + " cow, " + bullCounter + " bull");

    System.out.println("Guesses so far: " +this.countGuesses);
  }
}
