package week6.w3schools.libraryReDo.items;

public class ModernBook extends Book implements Rentable {
    private String isbn;

    @Override
    public void report () {
        System.out.println("Modern book rented");
    }

    public ModernBook(String title, String author, String isbn, boolean available){
        super(title, author, available);
        this.isbn = isbn;

    }


}
