package main.java.com.georgescuconstantin.bookstore;

public class Book {

    private String title;
    private String author;
    private String publisher;
    private int pageCount;

    public Book(String title, String author, String publisher, int pageCount) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pageCount = pageCount;

    }

    public int getPageCount() {
        if (pageCount == 0) {
            System.out.println("The book has no number of pages !");
        } else {
            return pageCount;
        }
        return getPageCount();
    }

    public String getTitle() {
        return title;
    }


}