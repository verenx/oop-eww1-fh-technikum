package week6.w3schools.coffeehouse;

public class Coffee extends Item implements Buyable {
    private boolean hot;

    public Coffee(String name, double price, boolean hot) {
        super(name, price);
        this.hot = hot;
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
