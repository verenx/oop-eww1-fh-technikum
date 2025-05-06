package week6.w3schools.libraryReDo;

import week6.w3schools.libraryReDo.items.Rentable;

public class Library {
    public void rent(Rentable rentable) {
        if (rentable.isAvailable()) {
            rentable.report();
        }
    }
}
