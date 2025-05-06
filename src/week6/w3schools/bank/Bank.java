package week6.w3schools.bank;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts = new ArrayList<>();

    public ArrayList<Account> getArrayList(){
        return this.accounts;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void removeAccount(Account account) {
        this.accounts.remove(account);
    }

    public void printAccounts(){
        for(int i = 0; i < getArrayList().size(); i++) {
            System.out.println(getArrayList().get(i));
        }
    }



}
