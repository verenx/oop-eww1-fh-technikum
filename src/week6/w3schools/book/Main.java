package week6.w3schools.book;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {

//        Rectangles rectangle = new Rectangles(4, 5);
//        Rectangles rectangle1 = new Rectangles(4, 5);
//
////        rectangle.getArea();
////        System.out.println(rectangle.getArea(45, 22));
//
//        rectangle.setHeight(6);
//        rectangle.setWidth(12);
//        System.out.println(rectangle.getArea());
//        System.out.println(rectangle.getPerimeter());


            Book book = new Book("Hello", "Verena", "1234-5678-1234");
            Book bookNew = new Book("Hi", "Tanja", "1245-7654-8906");
            Book book3 = new Book("hioi", "xyxy", "1235-5678-1234");
            Book book4 = new Book("diiudiud", "jodiuod", "1245-76d4-8906");

            BookCollection collection = new BookCollection();

            collection.addBooks(book);
            collection.addBooks(bookNew);


//        System.out.println(collection.toString());

        System.out.println(collection);

        ArrayList<Book> array = collection.getBookArray();

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).getTitle());
        }

//           for (int i = 0; i < collection.getBookArray().length; i++) {
//               if (collection.getBookArray()[i] == 0) {
//                   break;
//               }
//               System.out.println(collection.getBookArray()[i].getTitle());

           }
        }


