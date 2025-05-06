package week6.w3schools.bookNormalArray;

public class BookCollection {
    //hier muss eine NORMALE Array gemacht werden
    //dann erstmal eine Methode addBooks
    //und dann eine Methode removeBooks, die laut ChatGpt etwas kompliziert sein soll

    private Book[] books; // hier liegt das Array
    private int count; // Wie viele Bücher aktuell gespeichert sind

    public BookCollection() {
        this.books = new Book[10];
        this.count = 0;
    }

    public void addBook(Book book) {
       if (count < books.length) {
           books[count] = book;
           count++;
       }
    }

    public Book[] getBooks() {
        return this.books;
    }

//    public void setBooks(Book[] books) {
//        this.books = books;
//    }
}
