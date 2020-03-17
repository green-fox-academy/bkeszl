package sharpieset;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  List<Sharpie> sharpieSet;

  public int countUsable(List<Sharpie> sharpieSet) {
    int usable = 0;
    for (int i = 0; i < sharpieSet.size() ; i++) {
      if (sharpieSet.get(i).inkAmount != 0) {
        usable++;
      }
    }
    return usable;
  }
  public void removeTrash(List<Sharpie> sharpieSet){
    for (int i = 0; i < sharpieSet.size() ; i++) {
      if (sharpieSet.get(i).inkAmount == 0) {
        sharpieSet.remove(i);
      }
    }
  }

  public void add(Sharpie sharpie) {
    sharpieSet.add(sharpie);
  }
}
