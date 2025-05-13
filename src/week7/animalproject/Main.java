package week7.animalproject;

public class Main {
    public static void main(String[] args) {

        AnimalSymphony a1 = new AnimalSymphony();
        a1.populateArray();
        a1.printArray();
        a1.hasDogInIt();
        a1.printDogIndices();
        System.out.println(a1.showDogToCatRatio());
    }
}
