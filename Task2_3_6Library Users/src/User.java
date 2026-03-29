import java.util.ArrayList;

public class User {
    private String name;
    private int age;

    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        System.out.println(name + " borrowed " + book.getTitle());
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        System.out.println(name + " returned " + book.getTitle());
    }

    public void showBorrowedBooks() {
        System.out.println(name + " borrowed books:");
        for (Book b : borrowedBooks) {
            System.out.println(b.getTitle());
        }
    }
}