import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListManager {

    private ArrayList<String> groceryList = new ArrayList<>();
    private HashMap<String, Double> prices = new HashMap<>();
    private HashMap<String, String> categories = new HashMap<>();
    private HashMap<String, Integer> quantities = new HashMap<>();

    // add item + cost + category + quantity
    public void addItem(String item, double cost, String category, int quantity) {
        groceryList.add(item);
        prices.put(item, cost);
        categories.put(item, category);
        quantities.put(item, quantity);
    }

    public void removeItem(String item) {
        groceryList.remove(item);
        prices.remove(item);
        categories.remove(item);
        quantities.remove(item);
    }

    // update quantity
    public void updateQuantity(String item, int newQuantity) {
        if (quantities.containsKey(item)) {
            quantities.put(item, newQuantity);
        }
    }

    // display all
    public void displayList() {
        for (String item : groceryList) {
            System.out.println(item +
                    " | price: " + prices.get(item) +
                    " | category: " + categories.get(item) +
                    " | qty: " + quantities.get(item));
        }
    }

    // show only available items (qty > 0)
    public void displayAvailableItems() {
        System.out.println("Available items:");

        for (String item : groceryList) {
            if (quantities.get(item) > 0) {
                System.out.println(item +
                        " | qty: " + quantities.get(item));
            }
        }
    }

    public double calculateTotalCost() {
        double total = 0;

        for (String item : groceryList) {
            total += prices.get(item) * quantities.get(item);
        }

        return total;
    }
}