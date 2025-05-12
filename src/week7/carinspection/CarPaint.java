package week7.carinspection;

public class CarPaint implements Job{
    private Car car;

    public CarPaint(Car car) {
        this.car = car;
    }

    public int getMinNumberOfWorkers(){
        return 2;
    }

    public int getBasePrice(){
        if (car.year < 2000){
            return 200;
        } else {
            return 150;
        }
    }

    public int getHours(){
        return 10;
    }

    public String getName(){
        return "Car Paint";
    }
}
