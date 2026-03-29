public class LibraryMain {
    public static void main(String[] args) {

        Book b1 = new Book("Java", "Ali", 2020);
        Book b2 = new Book("DSA", "Sara", 2018);
        Book b3 = new Book("Python", "Reza", 2021);

        b1.setRating(4.5);
        b2.setRating(3.5);
        b3.setRating(4.0);

        b1.addReview("Good");
        b1.addReview("Very good");

        b2.addReview("Hard");

        b3.addReview("Nice");
        b3.addReview("Easy");
        b3.addReview("Useful");

        Library lib = new Library();

        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);

        System.out.println("Average rating: " + lib.getAverageBookRating());

        Book most = lib.getMostReviewedBook();
        System.out.println("Most reviewed book: " + most.getTitle());
    }
}