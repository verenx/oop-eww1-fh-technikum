package week6.w3schools.interfaces.draw;

public class Tesserakt extends Shape {
    private double kantenlänge;

    public Tesserakt(double kantenlänge){
        this.kantenlänge = kantenlänge;
    }

    @Override
    public double calcArea() {
        return 6 * Math.pow(this.kantenlänge, 2);
    }

    @Override
    public double calcPerimeter() {
        return 32 * this.kantenlänge;
    }
}
