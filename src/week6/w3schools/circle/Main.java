package week6.w3schools.circle;

public class Main {
    public static void main (String[] args) {

        double r = 4.5;
        Circle firstCircle = new Circle(r);

        double firstArea = firstCircle.getArea();
        System.out.println(firstArea);
        System.out.printf("Area: %.2f\n", firstArea);

        double firstCircumference = firstCircle.getCircumference();
        System.out.println(firstCircumference);
        System.out.printf("Circumference: %.2f\n", firstCircumference);

        r = 8;
        firstCircle.setRadius(r);
        System.out.printf("Area: %.2f", firstCircle.getArea());

    }
}
