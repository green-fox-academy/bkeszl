import java.util.ArrayList;
import java.util.HashMap;

public class ProductDatabaseTwo {
    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("Eggs",200);
        myMap.put("Milk",200);
        myMap.put("Fish",400);
        myMap.put("Apples",150);
        myMap.put("Bread",50);
        myMap.put("Chicken",550);

        dataBaser(myMap);
    }
    public static void dataBaser(HashMap<String, Integer> input) {
        ArrayList<String> lessThan201 = new ArrayList<>();
        ArrayList<String> moreThan150 = new ArrayList<>();
        for (String entry:input.keySet()) {
            if (input.get(entry)<201) {
                lessThan201.add(entry);
            }
            if (150 < input.get(entry)) {
                moreThan150.add(entry);
            }
        }
        System.out.println("Items that cost less than 201: "+ lessThan201);
        System.out.println("Items that cost more than 150: "+ moreThan150);
    }
}