package BurgasPizzaStore;

public abstract class PizzaStore {
    public abstract Pizza createPizza(String type);

    public void orderPizza(Pizza p) {
        p.bake ();
        p.box ();
        p.cut ();
    }

}
