import java.util.ArrayList;
import java.util.List;

class Book{
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int id, String title, String author, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    // getter setter
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book [id = " + id + ", title = " + title + ", author = " + author + ", isAvailable = " + isAvailable + "]";
    }
}

public class BookManagement {




    public static void main(String[] args) {
        List<Book> library = new ArrayList<>();

        // add book to library
        library.add(new Book(1, "Java Programming", " ", true));
        library.add(new Book(2, "Kotlin Programming", " ", true));
        library.add(new Book(3, "C Programming", " ", true));
        library.add(new Book(4, "C++", " ", true));
        library.add(new Book(5, "Flutter", " ", false));


        // display
        for(Book book : library){
            System.out.println(book);
        }

        // Issue book (U-update)
        issueBook(library,2);

        // display all the book after issuing
        System.out.println("\nBooks after issuing\n");
        for(Book book : library){
            System.out.println(book);
        }

        // return a book (update)
        returnBook(library,2);
        // display all the book after issuing
        System.out.println("\nBooks after returning\n");
        for(Book book : library){
            System.out.println(book);
        }

        // delete a book from the library(delete)
        deleteBook(library,5);
        // display all the book after deleting
        System.out.println("\nBooks after deleting\n");
        for(Book book : library){
            System.out.println(book);
        }
    }

    public static void issueBook(List<Book>library,int bookId){
        for(Book book : library){
            if(book.getId() == bookId && book.isAvailable()){
                book.setAvailable(false);
                System.out.println("\nBook " + bookId + " has been issued");
                return;
            }
        }
        System.out.println("\nBook " + bookId + " has not been issued (not available)");
    }

    public static void returnBook(List<Book>library,int bookId){
        for(Book book : library){
            if(book.getId() == bookId && !book.isAvailable()){
                book.setAvailable(true);
                System.out.println("\nBook " + bookId + " has been returned");
                return;
            }
        }
        System.out.println("\nBook " + bookId + " has not been returned");
    }

    public static void deleteBook(List<Book>library,int bookId){
        // library.remove(bookId);
        System.out.println("\nBook " + bookId + " has been deleted");
        library.removeIf(book -> book.getId() == bookId);

    }

}



