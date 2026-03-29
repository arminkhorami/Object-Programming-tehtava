import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public double getAverageBookRating() {
        if (books.isEmpty()) return 0;

        double sum = 0;

        for (Book b : books) {
            sum += b.getRating();
        }

        return sum / books.size();
    }

    public Book getMostReviewedBook() {
        if (books.isEmpty()) return null;

        Book max = books.get(0);

        for (Book b : books) {
            if (b.getReviewCount() > max.getReviewCount()) {
                max = b;
            }
        }

        return max;
    }
}