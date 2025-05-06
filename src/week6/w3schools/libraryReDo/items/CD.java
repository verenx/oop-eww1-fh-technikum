package week6.w3schools.libraryReDo.items;

public class CD extends Item implements Rentable {
    private String title;
    private String artist;

    public CD(String title, String artist, boolean available){
        super(available);
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void report () {
        System.out.println("CD rented");
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
