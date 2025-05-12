package week6.w3schools.interfaces.draw;

public abstract class Shape implements Drawable {
    protected double area;
    protected double perimeter;

    public void draw(){
    }

    public abstract double calcArea();
    public abstract double calcPerimeter();

}
