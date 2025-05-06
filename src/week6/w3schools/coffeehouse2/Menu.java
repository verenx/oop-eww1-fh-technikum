package week6.w3schools.coffeehouse2;

import java.util.ArrayList;
import java.util.Arrays;

public class Menu implements Printables{
    private ArrayList<CakeType> caketypes = new ArrayList<>(Arrays.asList(CakeType.values()));
    private ArrayList<DrinkType> drinktypes = new ArrayList<>(Arrays.asList(DrinkType.values()));



    public void printMenu() {
        int count = 1;
        System.out.println("Kuchen: ");
        for (CakeType cake : caketypes) {
            System.out.println(count++ + " " + cake.getDisplayName() + " " + cake.getPrice() + "€");
        }
        System.out.println("Getränke: ");
        for (DrinkType drink : drinktypes) {
            System.out.println(count++ + " " + drink.getDisplayName() + " " + drink.getPrice() + "€");

        }
        // implement how to quit



    }
}
