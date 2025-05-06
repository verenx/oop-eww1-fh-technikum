package week6.w3schools.libraryReDo.items;

abstract class Book extends Item {
    protected String title;

    public String getTitle() {
        return title;
    }

    protected String author;

    public Book(String title, String author, boolean available) {
        super(available);
        this.title = title;
        this.author = author;
    }
}
