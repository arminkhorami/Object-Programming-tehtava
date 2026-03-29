public class LibraryMain {
    public static void main(String[] args) {

        Book b1 = new Book("Java", "Ali", 2020);
        Book b2 = new Book("DSA", "Sara", 2018);

        b1.setRating(4.5);
        b2.setRating(3.8);

        b1.addReview("Very good book");
        b1.addReview("Helpful");

        b2.addReview("Hard but useful");

        System.out.println(b1.getTitle() + " rating: " + b1.getRating());
        System.out.println(b1.getTitle() + " reviews: " + b1.getReviewCount());

        System.out.println(b2.getTitle() + " rating: " + b2.getRating());
        System.out.println(b2.getTitle() + " reviews: " + b2.getReviewCount());
    }
}