package week6.w3schools.vehicle;

public class Truck extends Vehicle {
    private double payloadCapacity;

    public Truck(String make, String model, int year, double payloadCapacity){
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

//    public void displayTruckDetails(){
//        System.out.println("This truck is of the make " + make + " and model " + model + " designed in the year " + year + " and has a payload capacity of " + payloadCapacity + "t.");
//    }

    public void displayTruckDetails(){
        super.displayDetails();
        System.out.println("Payload capacity: " + payloadCapacity + " tons.");
    }

    public double getPayloadCapacity() {
        return this.payloadCapacity;
    }

    public void setPayloadCapacity(double payloadCapacity){
        if(payloadCapacity > 0) {
            this.payloadCapacity = payloadCapacity;
        } else {
            System.out.println("Payload capacity must be positive.");
        }
    }


}
