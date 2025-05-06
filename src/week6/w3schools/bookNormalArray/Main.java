package week6.w3schools.bookNormalArray;

public class Main {
    public static void main (String[] args) {

//        BookCollection.setBooks(books[0]) = new Book("Sofies Welt", "Jostein Garder", "1234-5678-9123");
//        books[1] = new Book("Das Land der Anderen", "Leila Slimani", "2345-6789-1234");

        BookCollection collection = new BookCollection();

        collection.addBook(new Book("Sofies Welt", "Jostein Gaarder", "1234-5678-9123"));
        collection.addBook(new Book("Das Ende der Ehe", "Roig Emilia", "1234-5678-9123"));

        Book[] books = collection.getBooks();

        //Bücher ausgeben
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i]);
            }
        }






    }
}
