import model.Book;
import model.LibraryMember;
import system.Library;

public class Main {
    public static void main(String[] args) {

        Library lib = new Library();

        Book b1 = new Book("Java");
        LibraryMember m1 = new LibraryMember("Reza");

        lib.reserveBook(m1, b1);
        lib.showReserved(m1);

        lib.cancelReservation(m1, b1);
    }
}