package week6.w3schools.vehicle;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("Skoda", "Fabia", 2025, 14);
        Truck t1 = new Truck("VW", "Amarok", 2020, 80);


        System.out.println(c1.displayCarDetails("Skoda", "Fabia", 2025, 14));
        t1.displayTruckDetails();

        c1.displayCarDetails2();
        t1.displayTruckDetails();

        t1.setPayloadCapacity(78.8);
        System.out.println(t1.getPayloadCapacity());
        System.out.println(c1.getTrunkSize());

        c1.changeTrunkSize(12.7);






    }
}
