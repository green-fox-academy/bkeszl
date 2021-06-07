package charsequence;

public class Main {
  public static void main(String[] args) {
    Gnits g = new Gnits("tnesnoc tuohtiW");
    System.out.println(g.charAt(1));
    System.out.println(g.subSequence(0,g.length()));

    //so many ways to break shifter, its not even funny
    Shifter s = new Shifter("example", 2);
    System.out.println(s.charAt(0));

  }
}
