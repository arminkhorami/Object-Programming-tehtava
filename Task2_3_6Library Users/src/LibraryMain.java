public class LibraryMain {
    public static void main(String[] args) {

        Library lib = new Library();

        Book b1 = new Book("Java", "Ali", 2020);
        Book b2 = new Book("DSA", "Sara", 2018);

        lib.addBook(b1);
        lib.addBook(b2);

        User u1 = new User("Ahmad", 20);

        lib.addUser(u1);

        lib.borrowBook(u1, "Java");
        u1.showBorrowedBooks();

        lib.returnBook(u1, b1);

        u1.showBorrowedBooks();
    }
}