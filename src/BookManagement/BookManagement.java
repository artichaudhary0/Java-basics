package BookManagement;

import OOPS.Abstraction.Abstraction;

import java.util.List;

class Book extends Publication{
    private String title;
    private String author;
    private final String isBn ;
    private int quantity;

    // parameterized
    public Book(String title, String author, String isBn, int quantity) {
        this.title = title;
        this.author = author;
        this.isBn = isBn;
        this.quantity = quantity;
    }

    // Getter and setter for encapsulation
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
    public int getQuantity() {
        return quantity;
    }
    public String getIsBn() {
        return isBn;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isBn);
        System.out.println("Quantity: " + quantity);
    }
}

class Library{
    public static int totalBooks = 0;

    // adding single book
    public static void addBook(Book book){
        totalBooks += book.getQuantity();
        System.out.println(book.getQuantity() + " copies of "+ book.getTitle() + " added.");
    }

    // adding multiple book
    public static void addBook(Book book, int additionalCopies){
        totalBooks += additionalCopies;
        book.setQuantity(book.getQuantity() + additionalCopies);
        System.out.println(book.getQuantity() + " copies of "+ book.getTitle() + " added.");
    }


    public static void removeBook(Book book){
        totalBooks -= book.getQuantity();
        System.out.println(book.getQuantity() + " copies of "+ book.getTitle() + " removed.");
    }

    public static void removeBook(Book book, int additionalCopies){
        totalBooks -= additionalCopies;
    }

    public static void searchBook(Book[] books , String query){
        for(Book book : books){
            if(book.getTitle().equals(query) || book.getAuthor().equals(query)){
                book.displayInfo();
                return;
            }
        }
        System.out.println(books[0].getTitle() + " not found.");
    }


    public static void  displayTotalBooks(){
        System.out.println("Total Books: " + totalBooks);
    }
}

class ReferenceBook extends Book{
    private String category;

    // constructor
    public ReferenceBook(String title, String author, String isBn, int quantity, String category) {
        super(title, author, isBn, quantity);
        this.category = category;
    }

    @Override
    public String toString() {
        return "Reference Book : " + getTitle() + " |Author : " + getAuthor() + " |Quantity : " + getQuantity() + " |Category : " + category;
    }

    @Override
    public void displayInfo(){
        System.out.println(toString());
        System.out.println("ISBN: " + super.getIsBn());
        System.out.println("Title: " + super.getTitle());
        System.out.println("Author: " + super.getAuthor());
        System.out.println("Quantity: " + super.getQuantity());
        System.out.println("Category: " + category);
    }
}

abstract class Publication{
    abstract void displayInfo();
}

interface Borrowable{
    void borrowBook();
    void returnBook();
}


public class BookManagement {

    public static void main(String[] args) {
        Book book1 = new Book("Book 1", "Author 1", "ISBN 1", 5);

        // Anonymous Inner class to represent the borrowed book
        Borrowable borrowableBook = new Borrowable(){

            private boolean isBorrowed = false;

            @Override
            public void borrowBook() {
                if(!isBorrowed && book1.getQuantity()>0)
                {
                    book1.setQuantity(book1.getQuantity() - 1);
                    isBorrowed = true;
                    System.out.println("Book borrowed : " +  book1.getTitle());
                }else {
                    System.out.println("Book not borrowed : " +  book1.getTitle());
                }
            }

            @Override
            public void returnBook() {
                if(isBorrowed)
                {
                    book1.setQuantity(book1.getQuantity() + 1);
                    isBorrowed = false;
                    System.out.println("Book returned : " +  book1.getTitle());
                }else {
                    System.out.println("Book not returned : " +  book1.getTitle());
                }
            }
        };

        borrowableBook.borrowBook();
        borrowableBook.returnBook();
    }
}

