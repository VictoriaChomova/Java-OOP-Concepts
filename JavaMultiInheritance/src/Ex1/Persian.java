package Ex1;

public class Persian extends Cat{
    public String name;
    public int age;

    public Persian () {
        super("persian");
        this.name = "Snowbell";
        this.age = 3;
    }

    @Override
    public void show() {
        System.out.println ("This is a " + this.species + " animal of class " + this.clas + " and breed " +
                this.breed + ". The cat's name is " + this.name + " and it is " + this.age + " years old.");

    }
}
