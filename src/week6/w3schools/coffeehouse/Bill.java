package week6.w3schools.coffeehouse;

import java.util.ArrayList;

public class Bill {

    protected ArrayList<Buyable> billedItems = new ArrayList<>();

    public void addItem(Buyable buyable) {
        billedItems.add(buyable);
    }

    public void printBill() {
        for (Buyable billedItem : billedItems) {
            System.out.println("Bill includes: " + billedItem);
        }
    }

//    public double calculateTotal(ArrayList<Buyable> billedItems) {
//
//}
}
