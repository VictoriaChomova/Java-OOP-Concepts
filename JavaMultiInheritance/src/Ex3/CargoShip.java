package Ex3;

public class CargoShip extends Ship{
    public String companyName;
    public double volume;
    public String name;


    public CargoShip(String companyName, double volume, String name) {
        super("cargo ship");
        this.companyName = companyName;
        this.volume = volume;
        this.name = name;
    }

    public void showDetails() {
        System.out.println ("Vessel type: ship\nShip type: cargo ship\nCompany name: " +  this.companyName +
                "\nVolume: " + this.volume + "\nName: " + this.name);
    }
}
