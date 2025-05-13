package week7.animalproject;

import week7.Animal;

public class Dog implements Animal {

    @Override
    public String makeSound(){
        return "bark";
    }

    @Override
    public String animalName(){
        return "Dog";
    }
}
