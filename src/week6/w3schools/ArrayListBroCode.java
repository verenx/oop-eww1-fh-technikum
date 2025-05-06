package week6.w3schools;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBroCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();
        System.out.print("Enter the number of foods you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine(); // clear scanner

        for (int i = 1; i <= numOfFood; i++)  {
            System.out.println("Enter food #" + i +": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();


    }
}
