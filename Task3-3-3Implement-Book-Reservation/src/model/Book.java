package model;

public class Book {
    private String title;
    private boolean reserved = false;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() { return title; }
    public boolean isReserved() { return reserved; }
    public void setReserved(boolean r) { reserved = r; }
}