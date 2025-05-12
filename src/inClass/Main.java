package inClass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //List<Integer> numbers = new ArrayList<>(); //gemeinsames Interface ist einfach List vorne angeben, das ist best practice
        List<Integer> numbers = new LinkedList<>(); // jetzt einfach ändern zu LinkedList und Programm funktioniert noch, testen, ob Programm jetzt langsamer läuft

        System.out.println(numbers.size()); //jetzt noch 0, aber trotzdem sind schon 10 Stellen reserviert, sehen wir nicht, weil es abstrahiert wird
        numbers.add(1);
        numbers.add(3);
        numbers.add(1);
        numbers.add(7);
        System.out.println(numbers.size());

    }
}
