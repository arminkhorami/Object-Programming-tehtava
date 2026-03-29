public class LibraryMain {
    public static void main(String[] args) {

        Book b1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book b2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book b3 = new Book("The Art of Fiction", "Alice Johnson", 2019);

        Library library = new Library();

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        library.displayBooks();

        library.findBooksByAuthor("Jane Doe");

        library.borrowBook("Introduction to Java Programming");

        library.displayBooks();

        library.returnBook(b1);

        library.displayBooks();
    }
}