import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Add book
    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books
    public void displayBooks() {
        System.out.println("Library Catalog:");
        int index = 1;

        for (Book b : books) {
            System.out.println(index + ". Title: \"" + b.getTitle() +
                    "\", Author: \"" + b.getAuthor() +
                    "\", Year: " + b.getYear());
            index++;
        }
    }

    // Find books by author
    public void findBooksByAuthor(String author) {
        System.out.println("\nBooks by Author \"" + author + "\":");

        for (Book b : books) {
            if (b.getAuthor().equals(author)) {
                System.out.println("Title: \"" + b.getTitle() +
                        "\", Year: " + b.getYear());
            }
        }
    }
}