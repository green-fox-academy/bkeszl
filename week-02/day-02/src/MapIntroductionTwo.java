import java.util.HashMap;

public class MapIntroductionTwo {
    public static void main(String[] args) {
        HashMap<String, String> myMap = new HashMap<>();
        System.out.println(myMap.isEmpty());
        myMap.put("978-1-60309-452-8", "A Letter to Jo");
        myMap.put("978-1-60309-459-7", "Lupus");
        myMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        myMap.put("978-1-60309-461-0", "The Lab");

        for (String entry:myMap.keySet()) {
            System.out.println(myMap.get(entry) + " (ISBN: " + entry + ")");
        }
        myMap.remove("978-1-60309-444-3");
        //System.out.println(myMap.size());
        for (String entry:myMap.keySet()) {
            if (myMap.get(entry).equals("The Lab")) {
                myMap.remove(entry);
            }
        }
        //System.out.println(myMap.size());
        myMap.put("978-1-60309-450-4", "They Called Us Enemy");
        myMap.put("978-1-60309-453-5", "Why Did We Trust Him?");
        System.out.println(myMap.containsKey("478-0-61159-424-8"));
        System.out.println(myMap.get("978-1-60309-453-5"));
    }
}