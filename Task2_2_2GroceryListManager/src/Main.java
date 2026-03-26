public class Main {
    public static void main(String[] args) {

        GroceryListManager g = new GroceryListManager();

        g.addItem("Apples", 2.5);
        g.addItem("Milk", 1.8);
        g.addItem("Bread", 3.0);

        System.out.println("Grocery List:");
        g.displayList();

        System.out.println("\nIs Milk in list? " + g.checkItem("Milk"));

        System.out.println("\nRemoving Milk...");
        g.removeItem("Milk");

        System.out.println("\nUpdated List:");
        g.displayList();

        System.out.println("\nTotal cost: " + g.calculateTotalCost());
    }
}