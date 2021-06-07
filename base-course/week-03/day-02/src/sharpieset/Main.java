package sharpieset;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<Sharpie> sharpieList = new ArrayList<Sharpie>();

    sharpieList.add(new Sharpie("blue", 2.35f, 11f));
    sharpieList.add(new Sharpie("red", 2.35f, 0));
    sharpieList.add(new Sharpie("yellow", 2.35f, 11f));

    SharpieSet sharpieSet = new SharpieSet();
    int usable = sharpieSet.countUsable(sharpieList);
    System.out.println(usable);
    sharpieSet.removeTrash(sharpieList);
    System.out.println("stuffs");
  }
}
