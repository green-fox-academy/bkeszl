import java.util.HashMap;

public class ProductDatabase {
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
        System.out.println("The fish is: " + input.get("Fish"));
        int sum = 0;
        int max = 0;
        int i =0;
        int min = 2147483647;
        int sub300Counter = 0;
        String maxName = "";
        String minName = "";
        for (String entry:input.keySet()) {
            sum= sum+input.get(entry);
            if (max < input.get(entry)) {
                max = input.get(entry);
            }
            if (input.get(entry) == max) {
                maxName = entry;
            }
            if (input.get(entry) < 300) {
                sub300Counter++;
            }
            if (input.get(entry) < min){
                min = input.get(entry);
            }
            if (input.get(entry) == min) {
                minName = entry;
            }
            i++;
        }

        System.out.println("Most expensive product is: " + maxName);
        System.out.println("Average price is: " + (sum/i));
        System.out.println("Products under 300: " + sub300Counter);
        System.out.println(input.containsValue(125));
        System.out.println("Least expensive product is: " + minName);

    }
}