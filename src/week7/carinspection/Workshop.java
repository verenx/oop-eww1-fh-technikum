package week7.carinspection;

import java.util.ArrayList;
import java.util.List;

public class Workshop {
    private List<Worker> workers = new ArrayList<>();
    private Job job;
    //ein Job = eine CarInspection, Interface ist dazu da, damit die Methoden vorgegeben sind, aber wie oft oder welche jobs das sind ist offen
    private List<Job> jobs = new ArrayList<>();

    public void addWorker(Worker name) {
        workers.add(name);
    }

    public void addJob(Job job) {
        jobs.add(job);
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String getCarType() {
        if (job.getBasePrice() == 150) {
            return "new car";
        } else {
            return "old car";
        }
    }

//    public void ArrayToString() {
//        System.out.println(workers.toString());
//    }

    public void printArray() {
        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }

    public void printPrice() {
        int totalPrice = 0;
        for (Worker worker : workers) {
            String type;
            if(worker.getHourlyRate() == 50) {
                type = "Senior";
            } else {
                type = "Junior";
            }
            String name = worker.getName();
            int hoursPerWorker = job.getHours()/workers.size();
            int hourlyRate = worker.getHourlyRate();

            System.out.printf("%s (%s) %d x %d\n", type, name, hoursPerWorker, hourlyRate);
            totalPrice = totalPrice + hourlyRate * hoursPerWorker;
        }

        System.out.printf("Inspection (%s): %d\n", getCarType(), job.getBasePrice());
        System.out.println("--------");
        System.out.println(totalPrice + job.getBasePrice());
    }

    public void printPossible() {
        if (job.getMinNumberOfWorkers() >= 2) {
            System.out.println("possible");
        } else {
            System.out.println("not possible");
        }
    }

        public void printReport() {
            System.out.println("Workshop Report");
            System.out.printf("Job: %s\n", job.getName()); //String Methode in der Job Klasse getName
            System.out.printf("Number of workers required: %d\n", job.getMinNumberOfWorkers());
            System.out.printf("Number of actual workers: %d\n", workers.size());
            System.out.printf("Hours needed: %d\n", job.getHours());
            System.out.println("Price: ");
            printPrice();
            System.out.print("Status: ");
            printPossible();
        }

}


