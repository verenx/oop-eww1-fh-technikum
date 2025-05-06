package week6.w3schools.libraryReDo.items;

public class AntiqueBook extends Book {
    private int value;

    public AntiqueBook(String author, String title, int value) {
        super(author, title, false);
        this.value = value;
    }
}
