package week6.w3schools.vehicle;

public class Car extends Vehicle{
    private double trunkSize;

    public Car(String make, String model, int year, double trunkSize) {
        super(make, model, year);
        this.trunkSize = trunkSize;
    }

    public String displayCarDetails(String name, String make, int year, double trunkSize) {
        return "This car is of the make " + make + " and of the model " + model + " released in " + year + " and has an amzing trunksize of " + trunkSize + " m3.";
    }

    public void displayCarDetails2(){
        super.displayDetails();
        System.out.println("Trunk Size: " + trunkSize + " cubic feet.");
    }

    public double getTrunkSize(){
        return this.trunkSize;
    }

    public void setTrunkSize(double trunkSize) {
        if(trunkSize > 0) {
            this.trunkSize = trunkSize;
        } else {
            System.out.println("The trunk size must be positive");
        }
    }

    public void changeTrunkSize(double newSize) {
        if (newSize > 0) {
            double oldSize = this.trunkSize; // alten Wert speichern
            this.trunkSize = newSize;         // neuen Wert setzen
            System.out.println("Trunk size changed from " + oldSize + " to " + newSize + " cubic feet.");
        } else {
            System.out.println("Invalid trunk size. It must be positive.");
        }
    }

}
