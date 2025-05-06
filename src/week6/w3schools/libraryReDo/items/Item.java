package week6.w3schools.libraryReDo.items;

import java.util.UUID;

public abstract class Item {
    protected String id;
    protected boolean available;

    public Item(boolean available) {
        this.available = available;
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return available;
    }

}
