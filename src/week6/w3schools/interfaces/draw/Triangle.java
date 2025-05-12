package week6.w3schools.interfaces.draw;

public class Triangle extends Shape implements Drawable{
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcArea(){
       double s = (a+b+c) / 2;
       return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public double calcPerimeter(){
        return a + b + c;
    }
}
