import java.util.Arrays;

public class Colors {
    public static void main(String[] args) {
        String[][] colors = {
                {"lime", "forest green", "olive", "pale green", "spring green"},
                {"orange red", "red", "tomato"},
                {"orchid", "violet", "pink", "hot pink"},
        };
        String[] animals = {"koal", "pand", "zebr"};
        for (int i = 0; i <animals.length ; i++) {
            animals[i]=animals[i].concat("a");
        }
        System.out.println(Arrays.toString(animals));
    }
}
