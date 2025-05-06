package week6.w3schools.coffeehouse;

public class CoffeeHouse {
    public void print(Buyable buyable) {
        buyable.buy();
    }

    public void description(Buyable buyable) {
        System.out.println(buyable.description(true));
    }
}
