package week6.w3schools.bank;

public class Account {
    private String name;
    private String iban;
    private double balance;

    public Account(String name, String iban, double balance) {
        this.name = name;
        this.iban = iban;
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }
    public String getIban() {
        return this.iban;
    }
    public double getBalance() {
        return this.balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }


    public String toString() {
        return name + " has account number " + "\"" + iban + "\"" + " with a balance of " + balance + "€.\n";
    }
}
