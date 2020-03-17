package counter;

public class Counter {
  int counter;
  int defaultValue;
  public Counter() {

  }

  public Counter(int counter) {
    this.defaultValue = counter;
    this.counter = counter;
  }

  public void add(int add) {
    this.counter+= add;
  }

  public void add() {
    this.counter++;
  }


  public int get() {
    return this.counter;
  }

  public void reset() {
    this.counter = this.defaultValue;
  }
}
