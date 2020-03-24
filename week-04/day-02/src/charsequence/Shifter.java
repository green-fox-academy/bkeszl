package charsequence;

public class Shifter  implements CharSequence {
  String toShift;
  int shiftBy;
  public Shifter(String toShift, int shiftBy) {
    this.toShift = toShift;
    this.shiftBy = shiftBy;
  }

  @Override
  public int length() {
    return toShift.length();
  }

  @Override
  public char charAt(int index) {
    if (toShift.length() < shiftBy + index) {
      return '0';
      //many more outliers
    }
    return toShift.charAt(shiftBy + index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return toShift.subSequence(start + shiftBy, end +shiftBy);
  }
}
