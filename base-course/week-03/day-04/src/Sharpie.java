public class Sharpie {
  String color;
  float width;
  float inkAmount;

  public Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
    inkAmount = 100;
  }

  public void use() {
    inkAmount--;
  }

  public static void main(String[] args) {
    Sharpie redSharpie = new Sharpie("Red", 2.35f);
    redSharpie.use();
    System.out.println(redSharpie.inkAmount);
    System.out.println(redSharpie.color);
  }
}