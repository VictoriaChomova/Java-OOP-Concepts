package BurgasPizzaStore;

public class BurgasPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals ("Margaritta")) {
            return new Margaritta ();
        } else if (type.equals ("Barbeque")) {
            return new Barbeque ();
        }
        return null;
    }
}
