package week6.w3schools.Sortable;

public class Main {
    public static void main(String[] args) {

        QuickSort q1 = new QuickSort(6, 8, 7);
//        q1.printArray();
        System.out.println(q1.getArray());
        //printet die Memory-Adresse
        int[] a1 = {5,3,8,1};
        q1.sort(q1.getArray());


    }
}
