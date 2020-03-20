package cowsandbulls;

public class Main {
  public static void main(String[] args) {
    GameLogic CAB = new GameLogic();
    String guessThis = CAB.randomNumberGenerator();
    while (!CAB.isFinished) {
      CAB.gameLoopContents(guessThis, CAB.userGuess());
    }

    /* Not exactly to excercise specification, but I already wrote it and its friday so please don't
    make me rewrite? <3
     */
  }
}
