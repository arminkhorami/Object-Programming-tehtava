import model.Book;
import model.LibraryMember;
import system.Library;

public class Main {
    public static void main(String[] args) {

        Library lib = new Library();

        Book b1 = new Book("Java", "Ali", "111");
        LibraryMember m1 = new LibraryMember("Reza", 1);

        lib.addBook(b1);
        lib.addMember(m1);

        lib.borrowBook(m1, b1);
        lib.returnBook(m1, b1);
    }
}