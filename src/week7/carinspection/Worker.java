package week7.carinspection;

public abstract class Worker {
    protected String name;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getHourlyRate() {
        return 0;
    }

    @Override
    public String toString() {
        return name;
    }
}
