package Ex6;
public class Drink {

    private String name;
    private String type;
    private double price;

    public Drink(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }

    double getPrice() {
        return price;
    }
}
