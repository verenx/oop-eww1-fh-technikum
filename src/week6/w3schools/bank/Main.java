package week6.w3schools.bank;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();
        Account firstAccount = new Account("Walters", "AT123-456-789", 12400);
        Account secondAccount = new Account("Jills", "AT173-456-789", 12800);
        Account thirdAccount = new Account("Hims", "AT183-456-789", 12870);

        bank.addAccount(firstAccount);
        bank.addAccount(secondAccount);
        bank.addAccount(thirdAccount);

        bank.printAccounts();











    }
}
