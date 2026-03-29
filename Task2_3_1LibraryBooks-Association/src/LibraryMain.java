public class LibraryMain {
    public static void main(String[] args) {

        // Create books
        Book b1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book b2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book b3 = new Book("The Art of Fiction", "Alice Johnson", 2019);

        // Create library
        Library library = new Library();

        // Add books
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        // Display all books
        library.displayBooks();

        // Search by author
        library.findBooksByAuthor("Jane Doe");
    }
}