package week6.w3schools.coffeehouse2;

public enum DrinkType {
    KRAUETERTEE(2, "Kräutertee"),
    SCHWARZER_TEE(2, "Schwarztee"),
    FANTA(4, "Fanta"),
    COLA(4, "Cola"),
    MELANGE(3.7, "Melange"),
    CAPPUCINO(5.4, "Cappucino");

    private final double price;
    private final String displayName;

    public double getPrice() {
        return price;
    }

    public String getDisplayName() {
        return displayName;
    }

    DrinkType(double price, String displayName){
        this.price = price;
        this.displayName = displayName;
    }
    }



