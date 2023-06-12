package Ex1;

public class Angora extends Cat{
    public String name;
    public int age;

    public Angora () {
        super("angora");
        this.name = "Garfield";
        this.age = 6;
    }

    @Override
    public void show() {
        System.out.println ("This is a " + this.species + " animal of class " + this.clas + " and breed " +
                this.breed + ". The cat's name is " + this.name + " and it is " + this.age + " years old.");

    }
}
