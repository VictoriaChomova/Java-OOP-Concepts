package Ex1;

public class Fish extends Animal implements Pet {
    private String name;

    public Fish(String name) {
        super (0);
        this.name = name;
    }

    public Fish() {

    }

    @Override
    public void eat() {
        System.out.println ("The fish eats smaller fish.");
    }

    @Override
    public void walk() {
        System.out.println ("The fish moves by swimming.");
    }

    @Override
    public void play() {
        System.out.println ("The fish plays in the water.");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
