package Ex1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Bird("Sparrow", "Black"));
        animals.add(new Bird("Eagle", "Grey"));
        animals.add(new Bird("Penguin", "Black and White"));
        animals.add(new Fish("Salmon", "Pink"));
        animals.add(new Fish("Tuna", "Blue"));
        animals.add(new Fish("Shark", "Grey"));
        animals.add(new Animal("Lion", "Brown"));
        animals.add(new Animal("Giraffe", "Yellow"));
        animals.add(new Animal("Bear", "Brown"));
        animals.add(new Animal("Wolf", "Grey"));
        animals.add(new Animal("Zebra", "Black and White"));
        for (Animal animal:  animals) {
            System.out.println(animal.getName() + " - " + animal.getColor());
        }
    }
}