public class Main {
    public static void main(String[] args) {

        GroceryListManager g = new GroceryListManager();

        g.addItem("Apples");
        g.addItem("Milk");
        g.addItem("Bread");

        System.out.println("Grocery List:");
        g.displayList();

        System.out.println("\nIs Milk in list? " + g.checkItem("Milk"));

        System.out.println("\nRemoving Milk...");
        g.removeItem("Milk");

        System.out.println("\nUpdated List:");
        g.displayList();
    }
}