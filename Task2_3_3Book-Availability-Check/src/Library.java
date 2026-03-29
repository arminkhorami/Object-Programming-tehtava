import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");
        int i = 1;
        for (Book b : books) {
            System.out.println(i + ". " + b.getTitle() + " - " + b.getAuthor() + " - " + b.getYear());
            i++;
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("Books by " + author + ":");
        for (Book b : books) {
            if (b.getAuthor().equals(author)) {
                System.out.println(b.getTitle());
            }
        }
    }

    public void borrowBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equals(title)) {
                books.remove(b);
                System.out.println("Borrowed: " + title);
                return;
            }
        }
        System.out.println("Not found");
    }

    public void returnBook(Book book) {
        books.add(book);
        System.out.println("Returned: " + book.getTitle());
    }

    public boolean isBookAvailable(String title) {
        for (Book b : books) {
            if (b.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }
}