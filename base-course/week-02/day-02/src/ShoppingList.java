import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingList {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>(Arrays.asList("Eggs", "Milk", "Fish", "Apples", "Bread", "Chicken"));
        itemCheck(shoppingList);
    }

    private static void itemCheck(List<String> shoppingList) {
        System.out.println(shoppingList.contains("Milk"));
        System.out.println(shoppingList.contains("Bananas"));
    }
}
