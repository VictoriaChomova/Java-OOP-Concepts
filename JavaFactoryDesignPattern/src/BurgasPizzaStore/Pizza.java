package BurgasPizzaStore;

public class Pizza {
    public String pizzaName;
    public String pizzaDough;
    public String pizzaSauce;

    public Pizza(String name, String dough, String sauce) {
        this.pizzaName = name;
        this.pizzaDough = dough;
        this.pizzaSauce = sauce;

    }


    public void bake() {
        System.out.println ("The pizza is in the oven.");
    }
    public void box() {
        System.out.println ("The pizza is in the box.");
    }
    public void cut() {
        System.out.println ("The pizza is cut and ready.");
    }
    public String getName() {
        return this.pizzaName;
    }
}
