package model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {

    private String name;
    private List<Book> reservedBooks = new ArrayList<>();

    public LibraryMember(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void addReservedBook(Book book) {
        reservedBooks.add(book);
    }

    public void removeReservedBook(Book book) {
        reservedBooks.remove(book);
    }

    public List<Book> getReservedBooks() {
        return reservedBooks;
    }
}