public class Main {
    public static void main(String[] args) {

        GroceryListManager g = new GroceryListManager();

        g.addItem("Apple", 2.5, "Fruits", 5);
        g.addItem("Milk", 1.8, "Dairy", 2);
        g.addItem("Bread", 3.0, "Bakery", 1);

        System.out.println("ALL ITEMS:");
        g.displayList();

        System.out.println("\nUPDATE QUANTITY (Apple = 10)");
        g.updateQuantity("Apple", 10);

        System.out.println("\nAVAILABLE ITEMS:");
        g.displayAvailableItems();

        System.out.println("\nTOTAL COST:");
        System.out.println(g.calculateTotalCost());
    }
}