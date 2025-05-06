package week6.w3schools.libraryReDo;

import week6.w3schools.libraryReDo.items.CD;
import week6.w3schools.libraryReDo.items.ModernBook;

public class Main {
    public static void main (String[] args) {
        ModernBook b1 = new ModernBook("Sofies Welt", "Jostein Gaarder", "1234-5678", true);
        CD c1 = new CD("Greatest Hits","ABBA", true);
        System.out.println(b1.isAvailable());

        Library library = new Library();
        library.rent(b1);
        library.rent(c1);
    }
}
