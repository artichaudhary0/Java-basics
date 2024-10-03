package BookManagement;

public class Maa{
    public static void main(String[] args) {
        Book book1 = new Book("Book 1", "Author 1", "ISBN 1", 5);
        ReferenceBook referenceBook =  new ReferenceBook("Maths" ,"Arti" ,"563245234",634536,"science");

        Library.addBook(book1);
        Library.addBook(referenceBook);
        Library.searchBook(new Book[] {book1 , referenceBook},"Arti");
        Library.displayTotalBooks();
        BookManagement.main(args);
    }
}
