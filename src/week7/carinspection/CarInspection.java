package week7.carinspection;

public class CarInspection implements Job {
    private Car car;

    public CarInspection(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public int getMinNumberOfWorkers() {
        return 2;
    }

    public int getBasePrice(){
     if (car.year < 2000) {
         return 200;
     } else {
         return 150;
     }
    }

    public String getName() {
        return "Car Inspection";
    }



//    public String printNewOld() {
//        if (car.year < 2000) {
//            return "old car";
//        } else {
//            return "new car";
//        }
//    }

    public int getHours(){
        return 10;
    }


}
