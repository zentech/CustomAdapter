package org.techgeorge.phraselist;

public class Book {
    private String bookTitle;
    private String bookAuthor;
    private int bookImageId;

    public Book(String bookTitle, String bookAuthor, int bookImageId) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookImageId = bookImageId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookImageId() {
        return bookImageId;
    }
}
