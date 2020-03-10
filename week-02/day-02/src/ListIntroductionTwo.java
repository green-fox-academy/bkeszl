import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroductionTwo {
    public static void main(String[] args) {
        List<String> listA = new ArrayList<>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));
        System.out.println(listA.size());
        List<String> listB = new ArrayList<>(listA);
        //System.out.println(listA.size());
        listB.remove("Durian");
        //System.out.println(listA);
        //System.out.println(listB);
        listA.add(4, "Kiwifruit");
        //System.out.println(listA);
        //System.out.println(listA.size() < listB.size());
        //System.out.println(listA.indexOf("Avocado"));
        //System.out.println(listB.indexOf("Durian"));
        //System.out.println(listB);
        listB.addAll(Arrays.asList("Pomelo", "Passion Pruit"));
       // System.out.println(listB);
        System.out.println(listA.get(2));
    }
}
