import java.util.ArrayList;

public class Sum {
  public int sum(ArrayList<Integer> inputList) {
    if (inputList == null) {
      return 0;
    }

    int sumOfListElements = 0;
    for (int i = 0; i < inputList.size(); i++) {
      sumOfListElements =  sumOfListElements + inputList.get(i);
    }
    return sumOfListElements;
  }
}
