import java.util.ArrayList;
import java.util.List;

public class ListIntroduction {
    public static void main(String[] args) {
        List<String> names = new ArrayList();
        System.out.println(names.size());
        names.add("William");
        System.out.println(names.isEmpty());
        names.add("James");
        names.add("Amanda");
        System.out.println(names.size());
        System.out.println(names.get(2));
        int i = 1;
        for (String name: names) {
            System.out.println(i + ". " +name);
            i++;
        }
        names.remove(1);
        for (int j = 0; j <names.size() ; j++) {
            System.out.println(names.get(names.size()-1-j));
        }
        names.clear();
        System.out.println(names.size());
    }
}
