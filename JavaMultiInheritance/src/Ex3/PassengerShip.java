package Ex3;

public class PassengerShip extends Ship{
    public String companyName;
    public double volume;
    public String name;


    public PassengerShip(String companyName, double volume, String name) {
        super("passenger ship");
        this.companyName = companyName;
        this.volume = volume;
        this.name = name;
    }

    public void showDetails() {
        System.out.println ("Vessel type: ship\nShip type: passenger ship\nCompany name: " +  this.companyName +
                "\nVolume: " + this.volume + "\nName: " + this.name);
    }
}
