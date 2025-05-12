package week6.w3schools.customer;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String email;
    private String purchase;
    private ArrayList<String> purchaseHistories;

    public Customer(String name, String email, String purchase){
        this.name = name;
        this.email = email;
        this.purchase = purchase;
        this.purchaseHistories = purchaseHistories;
    }

    public void addPurchase(){
        for(String purchaseHistory : purchaseHistories) {
            purchaseHistories.add(this.purchase);
        }
    }

}
