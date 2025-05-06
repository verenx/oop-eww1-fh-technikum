package week6.w3schools.employee;

public class Employee {
    private String name;
    private String jobTitle;
    private double basicSalary;
    private double managerPercentage;
    private double raisePercentage;

    public Employee(String name, String jobTitle, double basicSalary, double managerPercentage, double raise) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.basicSalary = basicSalary;
        this.managerPercentage = managerPercentage;
        this.raisePercentage = raise;
    }

    public double getBasicSalary() {
        return this.basicSalary;
    }
    public double getManagerPercentage() {
        return this.managerPercentage;
    }
    public double getRaise() {
        return this.raisePercentage;
    }

    public double getSalary() {
        return basicSalary * managerPercentage * raisePercentage;
    }

}
