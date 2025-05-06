package week6.w3schools.employee;

public class Main {
    public static void main(String[] args) {

        Employee accountant = new Employee("John Walters", "accountant", 3000, 1, 1.2);
        Employee cleaner = new Employee("John Walters", "accountant", 1800, 1, 1.2);
        Employee manager = new Employee("John Walters", "accountant", 4000, 4.5, 1);

        double accountantSalary = accountant.getSalary();
        double cleanerSalary = cleaner.getSalary();
        double managerSalary = manager.getSalary();
        System.out.printf("As an accountant you will make %.2f after your 2 year raise.\n", accountantSalary);
        System.out.printf("As a manager you will make %.2f.\n", managerSalary);
        System.out.printf("As a cleaner you will make %.2f after your 2 year raise.\n", cleanerSalary);

    }
}
