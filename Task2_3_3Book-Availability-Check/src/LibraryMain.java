public class LibraryMain {
    public static void main(String[] args) {

        Book b1 = new Book("Java", "Ali", 2020);
        Book b2 = new Book("DSA", "Sara", 2018);

        Library library = new Library();

        library.addBook(b1);
        library.addBook(b2);

        library.displayBooks();

        System.out.println("Available Java? " + library.isBookAvailable("Java"));

        library.borrowBook("Java");

        System.out.println("Available Java? " + library.isBookAvailable("Java"));
    }
}