package week6.w3schools.interfaces.draw;

public class Circle extends Shape implements Drawable{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void draw(){

    }

    public double calcArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double calcPerimeter(){
        return 2 * Math.PI * radius;
    }
}
