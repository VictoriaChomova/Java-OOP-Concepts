package FoodFactory;

public class FoodFactory {

    public Food getFood (String food, double price) {
        if (food.equals ("Vegetable")) {
            return new Vegetable (price);
        } else if (food.equals ("Dairy")) {
            return new Dairy (price);
        } else if (food.equals ("Salami")) {
            return new Salami (price);
        }
        return null;
    }
}
