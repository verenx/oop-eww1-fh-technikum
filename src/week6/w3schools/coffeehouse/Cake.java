package week6.w3schools.coffeehouse;

import week6.w3schools.coffeehouse2.CakeType;

public class Cake extends Item implements Buyable {
    private int portion;

    public Cake(String name, int portion, double price) {
        super(name, price);
        this.portion = portion;
    }

    @Override
    public void buy() {
        System.out.println("Thank you for buying " + name + ", please pay: " + price + ".");
    }

    @Override
    public String description(boolean temperature) {
        return "A delicious "  + temperature + " " + name + " for only " + price + "€.";
    }

    public String toString() {
        return name;
    }
}
