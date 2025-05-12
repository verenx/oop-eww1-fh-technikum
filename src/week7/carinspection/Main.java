package week7.carinspection;

public class Main {
    public static void main(String[] args) {
    Workshop w = new Workshop();
    w.addWorker(new SeniorWorker("Tom"));
    w.addWorker(new JuniorWorker("Tina"));

    //w.printArray();

    w.setJob(new CarInspection(new Audi(2010)));

    w.printReport();

    Workshop w2 = new Workshop();
    w2.addWorker(new SeniorWorker("Mohammed"));
    w2.addWorker(new JuniorWorker("Verena"));

    w2.setJob(new CarInspection(new Audi(1988)));

    w2.printReport();

    Workshop w3 = new Workshop();
    w3.addWorker(new SeniorWorker("Felicia"));
    w3.addWorker(new JuniorWorker("Teba"));

    w3.setJob(new CarPaint(new Audi(1900)));

    w3.printReport();

    }
}
