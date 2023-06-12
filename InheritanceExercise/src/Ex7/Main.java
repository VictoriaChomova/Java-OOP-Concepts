package Ex7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<> ();

        products.add(new Fruit("Apple", 0.99));
        products.add(new Fruit("Banana", 0.29));
        products.add(new Vegetable("Carrot", 0.49));
        products.add(new Vegetable("Broccoli", 0.89));
        products.add(new Spice("Cinnamon", 1.99));
        products.add(new Spice("Garlic", 0.79));
        for (Product p : products) {
            p.display();
        }
    }
}