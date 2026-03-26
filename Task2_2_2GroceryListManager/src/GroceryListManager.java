import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListManager {

    private ArrayList<String> groceryList = new ArrayList<>();
    private HashMap<String, Double> prices = new HashMap<>();

    public void addItem(String item, double cost) {
        groceryList.add(item);
        prices.put(item, cost);
    }

    public void removeItem(String item) {
        groceryList.remove(item);
        prices.remove(item);
    }

    public void displayList() {
        for (int i = 0; i < groceryList.size(); i++) {
            String item = groceryList.get(i);
            System.out.println((i + 1) + ". " + item + " - " + prices.get(item));
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