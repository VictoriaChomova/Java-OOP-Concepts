package DrinkFactory;


public class DrinkFactory {

    public Drink getDrink(String drink, double price) {
        if (drink.equals ("Soft Drink")) {
            return new SoftDrink (price);
        } else if (drink.equals ("Alcoholic Drink")) {
            return new AlcoholicDrink (price);
        } else if (drink.equals ("Caffeine Drink")) {
            return new CaffeineDrink (price);
        }
        return null;
    }
}
