public class Main {
    public static void main(String[] args) {

        GroceryListManager g = new GroceryListManager();

        g.addItem("Apple", 2.5, "Fruits");
        g.addItem("Milk", 1.8, "Dairy");
        g.addItem("Bread", 3.0, "Bakery");
        g.addItem("Banana", 2.0, "Fruits");

        System.out.println("ALL ITEMS:");
        g.displayList();

        System.out.println("\nFRUITS ONLY:");
        g.displayByCategory("Fruits");

        System.out.println("\nTOTAL COST: " + g.calculateTotalCost());
    }
}