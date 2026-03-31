package system;

import model.Book;
import model.LibraryMember;

public class Library {

    public void reserveBook(LibraryMember m, Book b) {
        if (!b.isReserved()) {
            b.setReserved(true);
            m.addReservedBook(b);
            System.out.println("Reserved: " + b.getTitle());
        } else {
            System.out.println("Already reserved");
        }
    }

    public void cancelReservation(LibraryMember m, Book b) {
        if (b.isReserved()) {
            b.setReserved(false);
            m.removeReservedBook(b);
            System.out.println("Canceled");
        }
    }

    public void showReserved(LibraryMember m) {
        for (Book b : m.getReservedBooks()) {
            System.out.println(b.getTitle());
        }
    }
}