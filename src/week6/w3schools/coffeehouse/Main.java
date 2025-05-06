package week6.w3schools.coffeehouse;

public class Main {
    public static void main (String[] args) {
        Coffee c1 = new Coffee("Melange", 4.6, true);
        Cake ca1 = new Cake("Sachertorte", 7,  5);

        CoffeeHouse cafe = new CoffeeHouse();

        cafe.print(c1);
        cafe.print(ca1);

        cafe.description(c1);

        Bill b1 = new Bill();
        b1.addItem(c1);
        b1.addItem(ca1);
        b1.printBill();
    }
}
