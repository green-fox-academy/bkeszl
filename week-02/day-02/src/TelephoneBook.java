import java.util.HashMap;

public class TelephoneBook {
    public static void main(String[] args) {
        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("William A. Lathan", "405-709-1865");
        myMap.put("John K. Miller", "402-247-8568");
        myMap.put("Hortensia E. Foster", "606-481-6467");
        myMap.put("Amanda D. Newland", "319-243-5613");
        myMap.put("Brooke P. Askew", "307-687-2982");

        booker(myMap);
    }
    public static void booker(HashMap<String, String> input) {
        System.out.println("J.K.Millers phone nr. is: " + input.get("John K. Miller"));
        System.out.println("307-687-2982 belongs to: " + getKey("307-687-2982" ,input));
        System.out.println(input.containsKey("Chris E. Myers"));

    }
    public static String getKey(String inString, HashMap<String,String> inHash) {
        for (String entry : inHash.keySet()) {
            if (inHash.get(entry).equals("307-687-2982")) {
                return entry;
            }
        }
        return "#error";
    }
}