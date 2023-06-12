package Ex3;

public class Planet {
    public String name;
    public double diameter;
    public double mass;
    public String type;
    public int positionToSun;

    public Planet(String name, double diameter, double mass, String type, int positionToSun) {
        this.name = name;
        this.diameter = diameter;
        this.mass = mass;
        this.type = type;
        this.positionToSun = positionToSun;
    }

    public Planet() {
    }

    public void show() {
        System.out.println ("Name: " + this.name);
        System.out.println ("Diameter: " + this.diameter);
        System.out.println ("Mass: " + this.mass);
        System.out.println ("Type: " + this.type);
        System.out.println ("Position: " + this.positionToSun);

    }
}
