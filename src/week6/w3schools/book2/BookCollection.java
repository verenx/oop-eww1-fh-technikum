package week6.w3schools.book2;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class BookCollection {

    private ArrayList<Book> books = new ArrayList<>();

//    public books(){
//
//    } //Wie sieht der Konstruktor hier aus?

    public ArrayList<Book> getBookArray() {
        return this.books;
    }

    public void addBook(Book book){
        this.books.add(book);
    }
    public void removeBook(Book book){
        this.books.remove(book);
    }
}
