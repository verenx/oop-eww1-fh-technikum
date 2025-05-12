package week6.w3schools.interfaces.draw;

public class Rectangle extends Shape implements Drawable{
    private int a;
    private int b;

    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    public double calcArea(){
        return a * b;
    }

    public double calcPerimeter(){
        return 2*(a*b);
    }
}
