package Ex1;

public class Animal {
    public String species;
    public String clas;


    public Animal (String a, String b) {
        this.species = a;
        this.clas = b;
    }

    public void show() {
        System.out.println ("This is a " + this.species + " animal of class " + this.clas);
    }


}
