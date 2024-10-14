package OOPS.Inheritance.Questions;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}

public class HybridExample {
    public static void main(String[] args) {
        // Create a library instance
        Library library = new Library();

        // Create some book instances
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);

        // Print out the books in the library
        for (Book book : library.getBooks()) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}
