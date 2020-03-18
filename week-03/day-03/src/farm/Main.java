package farm;

public class Main {
  public static void main(String[] args) {
    Farm farm = new Farm();
    farm.breed();
    farm.listOfAnimals.get(3).hunger--;
    farm.slaughter();
    System.out.println(farm.listOfAnimals.size());
  }
}
