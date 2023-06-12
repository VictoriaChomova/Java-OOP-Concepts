package Ex1;

public class Cat extends Animal{
    String breed;


    public Cat (String breed) {
        super("mammal", "cat");
        this.breed = breed;
    }


    @Override
    public void show() {
        System.out.println ("This is a " + this.species + " animal of class " + this.clas + " and breed " + breed);

    }
}
