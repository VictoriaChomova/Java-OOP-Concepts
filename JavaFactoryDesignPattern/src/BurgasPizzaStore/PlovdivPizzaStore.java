package BurgasPizzaStore;

public class PlovdivPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        if (type.equals ("Margaritta")) {
            return new Margaritta ();
        } else if (type.equals ("Barbeque")) {
            return new Barbeque ();
        }
        return null;
    }
}
