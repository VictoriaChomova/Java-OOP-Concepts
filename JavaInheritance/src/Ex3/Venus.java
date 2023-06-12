package Ex3;

public class Venus extends Planet{

    public Venus(String name, double diameter, double mass, String type, int positionToSun) {
//        Planet mercury = new Planet ("name", 3, 2, "type", 1);
        this.name = "Venus";
        this.diameter = 12103.7;
        this.mass = 4.8675e24;
        this.type = "rock";
        this.positionToSun = 2;
    }
}
