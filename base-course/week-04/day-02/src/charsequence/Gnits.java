package charsequence;

public class Gnits implements CharSequence {
  String onlyField;

  public Gnits(String input) {
    this.onlyField = input;
  }

  @Override
  public int length() {
    return this.onlyField.length();
  }

  @Override
  public char charAt(int index) {
    return this.onlyField.charAt(onlyField.length()- 1 - index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    CharSequence toReturn = this.onlyField.subSequence(onlyField.length()-end, onlyField.length()-start);
    StringBuilder buffer = new StringBuilder(toReturn);
    toReturn = buffer.reverse();
    return toReturn ;
  }
}
