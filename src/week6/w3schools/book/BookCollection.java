package week6.w3schools.book;

import java.util.ArrayList;

public class BookCollection {
    private ArrayList<Book> bookArray = new ArrayList<>(); //hier erstelle ich ein Array von der Klasse book und die beinhaltet die Objekte der Bücher, die dann noch Titel usw gespeichert haben
    private int index = 0;

    public ArrayList<Book> getBookArray() {
        return bookArray;
    }

    public void addBooks(Book book) {
        bookArray.add(book);
    }

    public void removeBooks(Book book) {
        bookArray.remove(book);
    }
}
