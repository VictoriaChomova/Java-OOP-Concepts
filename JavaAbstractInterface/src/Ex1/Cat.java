package Ex1;

public class Cat extends Animal implements Pet{
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat (){

    }

    @Override
    public void eat() {
        System.out.println ("The cat eats mice.");
    }

    @Override
    public void walk() {
        System.out.println ("The cat walks by feet.");
    }

    @Override
    public void play() {
        System.out.println ("The cat plays with mice.");
    }


    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
