package system;

import model.Book;
import model.LibraryMember;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();
    private List<LibraryMember> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(LibraryMember member) {
        members.add(member);
    }

    public void borrowBook(LibraryMember member, Book book) {
        member.borrowBook(book);
        System.out.println("Book borrowed: " + book.getTitle());
    }

    public void returnBook(LibraryMember member, Book book) {
        member.returnBook(book);
        System.out.println("Book returned: " + book.getTitle());
    }
}