import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListManager {

    private ArrayList<String> groceryList = new ArrayList<>();
    private HashMap<String, Double> prices = new HashMap<>();
    private HashMap<String, String> categories = new HashMap<>();

    // add item + cost + category
    public void addItem(String item, double cost, String category) {
        groceryList.add(item);
        prices.put(item, cost);
        categories.put(item, category);
    }

    public void removeItem(String item) {
        groceryList.remove(item);
        prices.remove(item);
        categories.remove(item);
    }

    public void displayList() {
        for (String item : groceryList) {
            System.out.println(item + " - " + prices.get(item) + " - " + categories.get(item));
        }
    }

    public void displayByCategory(String category) {
        System.out.println("Category: " + category);

        for (String item : groceryList) {
            if (categories.get(item).equals(category)) {
                System.out.println(item + " - " + prices.get(item));
            }
        }
    }

    public boolean checkItem(String item) {
        return groceryList.contains(item);
    }

    public double calculateTotalCost() {
        double total = 0;

        for (String item : groceryList) {
            total += prices.get(item);
        }

        return total;
    }
}