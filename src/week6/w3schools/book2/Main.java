package week6.w3schools.book2;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Book firstBook = new Book("Das Ende der Ehe", "Roig Emilia", "1234-5678-9123");
        Book secondBook = new Book("Sofies Welt", "Jostein Gaarder", "2345-6789-1234");
        BookCollection allBooks = new BookCollection();

        allBooks.addBook(firstBook);
        allBooks.addBook(secondBook);

        System.out.printf("The first book's title is \"%s\".\n", firstBook.getTitle());

        System.out.printf("All books: {%s}\n", allBooks.getBookArray());

        for (int i = 0; i < allBooks.getBookArray().size(); i++) {
            System.out.println(allBooks.getBookArray().get(i));
        }
    }
}
