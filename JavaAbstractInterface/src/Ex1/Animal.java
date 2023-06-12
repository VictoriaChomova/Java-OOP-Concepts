package Ex1;

public abstract class Animal {
    private int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public Animal() {

    }

    public abstract void eat();

    public void walk() {
        System.out.println ("The animal walks by feet.");
    }

}

