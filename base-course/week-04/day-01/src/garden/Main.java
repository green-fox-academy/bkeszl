package garden;

public class Main {
  public static void main(String[] args) {
    Garden garden = new Garden();
    garden.plants.add(new Flower("yellow"));
    garden.plants.add(new Flower("blue"));
    garden.plants.add(new Tree("purple"));
    garden.plants.add(new Tree("orange"));

    garden.report();
    garden.watering(40);
    garden.watering(70);

  }
}
