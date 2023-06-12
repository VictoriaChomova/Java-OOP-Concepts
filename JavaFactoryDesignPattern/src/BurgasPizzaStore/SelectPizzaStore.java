package BurgasPizzaStore;

public class SelectPizzaStore {

    public static PizzaStore getStore (String choice) {
        if (choice.equalsIgnoreCase ("Burgas")) {
            return new BurgasPizzaStore ();
        } else if (choice.equalsIgnoreCase ("Plovdiv")) {
            return new PlovdivPizzaStore ();
        }
        return null;
    }

}
