package week6.w3schools.coffeehouse2;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Order {
//    ArrayList<Item> orderedItems = new ArrayList<>();
//
//
//
////    public void addOrder() {
////        for (Item orderedItem : orderedItems) {
////        }
////    }
//
////    public void takeOrder(Scanner scanner) {
////
////    }
//
////    User gibt z.B. "Sachertorte" ein.
////    Du vergleichst das mit deinen CakeType-Werten.
////    Wenn es passt, erstellst du ein Cake-Objekt und speicherst es in orderedItems
//
//    public void displayOrder(Scanner scanner) {
//        System.out.println("Enter your drink name: ");
//        System.out.print("Drink: ");
//        String drinkInput = scanner.nextLine();
//        System.out.print("hot or cold (true for hot / false for cold): ");
//        boolean hot = scanner.nextBoolean();
//        scanner.nextLine();
//        System.out.println("Enter your cake number: ");
//        System.out.print("Cake #: ");
//        int cakeInput = scanner.nextInt();
//
//        for (CakeType cake : CakeType.values()) {
//            if (cake.getArticleId() == cakeInput) {
//                orderedItems.add(new Cake(1, cake));
//                System.out.println("Added Cake: " + cake.getDisplayName());
//            }
//        }
//        for (DrinkType drink : DrinkType.values()) {
//            if (drink.name().equalsIgnoreCase(String.valueOf(drinkInput))) {
//                orderedItems.add(new Drinks(hot, drink));
//                System.out.println("Added Drink: " + drink.getDisplayName());
//            }
//        }
//
//
//    }
//}
