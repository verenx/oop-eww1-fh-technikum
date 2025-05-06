package week6.w3schools.book;

public class Rectangles {
    private int width;
    private int height;

    public Rectangles(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight (int height) {
        this.height = height;
    }

    public int getArea() {
//        int result;
//        return result = width*height;
        return width*height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }

}
