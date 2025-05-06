package week6.w3schools.coffeehouse2;

public class Drinks extends Item {
    private boolean hot;
    DrinkType drinkType;

    public Drinks(boolean hot, DrinkType drinkType) {
        this.hot = hot;
        this.drinkType = drinkType;
    }
}
