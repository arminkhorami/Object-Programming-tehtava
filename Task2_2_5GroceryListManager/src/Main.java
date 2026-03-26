public class Main {
    public static void main(String[] args) {

        GroceryListManager g = new GroceryListManager();

        // ===== ADD ITEMS =====
        g.addItem("Apple", 2.5, "Fruits", 5);
        g.addItem("Milk", 1.8, "Dairy", 2);
        g.addItem("Bread", 3.0, "Bakery", 1);
        g.addItem("Banana", 2.0, "Fruits", 0);

        // ===== DISPLAY ALL =====
        System.out.println("ALL ITEMS:");
        g.displayList();

        // ===== CATEGORY TEST =====
        System.out.println("\nFRUITS:");
        g.displayByCategory("Fruits");

        // ===== CHECK TOTAL COST =====
        System.out.println("\nTOTAL COST:");
        System.out.println(g.calculateTotalCost());

        // ===== UPDATE QUANTITY =====
        System.out.println("\nUPDATE Apple quantity to 10");
        g.updateQuantity("Apple", 10);

        // ===== AVAILABLE ITEMS =====
        System.out.println("\nAVAILABLE ITEMS (qty > 0):");
        g.displayAvailableItems();

        // ===== REMOVE ITEM =====
        System.out.println("\nREMOVE Milk");
        g.removeItem("Milk");

        System.out.println("\nFINAL LIST:");
        g.displayList();
    }
}