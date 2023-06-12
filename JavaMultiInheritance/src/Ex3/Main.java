package Ex3;

public class Main {
    public static void main(String[] args) {
        CargoShip csh = new CargoShip ("Shipments", 7598479, "The ship");
        csh.showDetails ();

        PassengerShip psh = new PassengerShip ("Passengers", 4653788, "Ocean");
        psh.showDetails ();
    }
}
