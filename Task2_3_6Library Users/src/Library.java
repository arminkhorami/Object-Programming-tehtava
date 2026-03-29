import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public Book findBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equals(title)) {
                return b;
            }
        }
        return null;
    }

    public void borrowBook(User user, String title) {
        Book book = findBook(title);

        if (book != null) {
            books.remove(book);
            user.borrowBook(book);
        } else {
            System.out.println("Book not available");
        }
    }

    public void returnBook(User user, Book book) {
        books.add(book);
        user.returnBook(book);
    }
}