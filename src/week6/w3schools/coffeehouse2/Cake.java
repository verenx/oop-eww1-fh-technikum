package week6.w3schools.coffeehouse2;

public class Cake extends Item {
    private int portion;
    CakeType cakeType;

    public Cake(int portion, CakeType cakeType) {
        this.portion = portion;
        this.cakeType = cakeType;
    }
}
