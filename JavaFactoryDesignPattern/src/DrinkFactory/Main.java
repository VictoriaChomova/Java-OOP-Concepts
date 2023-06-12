package DrinkFactory;

public class Main {
    public static void main(String[] args) {
        DrinkFactory factory = new DrinkFactory ();

        Drink drink1 = factory.getDrink ("Soft Drink", 4);
        Drink drink2 = factory.getDrink ("Alcoholic Drink", 8);
        Drink drink3 = factory.getDrink ("Caffeine Drink", 5);

        drink1.buy (20, 3);
        drink2.buy (100, 10);
        drink3.buy (30, 10);

        drink1.drink ();

    }
}
