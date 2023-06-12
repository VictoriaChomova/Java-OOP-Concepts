package Ex3;

public class Pizza {
    String name;
    String dough;
    String sauce;
    String crust;


    public Pizza(String name, String dough, String sauce, String crust) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        this.crust = crust;
    }

    public String getName() {
        return this.name;
    }
}
