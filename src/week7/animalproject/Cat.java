package week7.animalproject;

import week7.Animal;

public class Cat implements Animal {

    @Override
    public String makeSound(){
        return "meow";
    }

    @Override
    public String animalName(){
        return "Cat";
    }
}
