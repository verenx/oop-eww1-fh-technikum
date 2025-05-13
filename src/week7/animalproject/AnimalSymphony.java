package week7.animalproject;

import week7.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnimalSymphony {
    private List<Animal> animals = new ArrayList<>();
    Random random = new Random();

    public void populateArray() {
//        Schreibe eine Methode populateArray(), die 10 zufällige Tiere (Dog oder Cat) hinzufügt.
//                * Nutze Random für eine 50/50-Chance.
        //mit Math.random kann man das auch machen = gibt eine zufällige Zahl zwischen 0-1
        for (int i = 0; i < 10; i++) {
            // cat = 1; dog = 0
            if (random.nextBoolean()) {
                animals.add(new Cat());
            } else {
                animals.add(new Dog());
            }
        }
    }

        public void printArray() {
            for (Animal animal : animals) {
                System.out.println(animal.animalName() + ":" + animal.makeSound() + " ");
            }
        }

        public String hasDogInIt(){
//        * Schreibe eine Methode, die prüft, ob mindestens ein Dog in der Liste ist.
//                    * Gib aus: “bark” wenn mindestens ein Dog enthalten ist, sonst null

          /*  for (Animal animal : animals) {
                if (animal.animalName() == "Dog") {
                    System.out.println("We found a dog in your array -->" + animal.makeSound());
                }
                hier wird der satz so oft geprintet, wie Dog in der liste ist = 5 mal
                unten durch return wird es nur einmal geprintet
            }*/


            for (Animal animal : animals) {
                if (animal.animalName() == "Dog") {
                    System.out.println("We found a dog in your array -->" + animal.makeSound());
                    return "bark";
                    //nach return ist die Schleife immer fertig, deshalb bekomme ich den Ausdruck jetzt nur einmal
                }
            }
            return null;

        }

        public void printDogIndices() {
//        * Durchlaufe die Liste und sammle die Indizes aller Dog-Instanzen.
//                    * Gib sie formatiert aus, z. B.: Indexes of dogs: 0, 3, 7.
            //animals.get(i) = gibt mir nur die Klasse zurück, das weiß nicht was ich damit machen will
            System.out.print("[");
            for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i).animalName() == "Dog") {
                    System.out.print(i + " ");
                }
            }
            System.out.print("]\n");
        }

        public double showDogToCatRatio() {
        int dogCount = 0;
        int catCount = 0;
        double ratio = 0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).animalName() == "Dog"){
                dogCount++;
            } else {
                catCount++;
            }
        }
            return ratio = (dogCount / catCount);
        }

}
