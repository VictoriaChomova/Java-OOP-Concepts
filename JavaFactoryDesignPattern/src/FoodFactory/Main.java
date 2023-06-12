package FoodFactory;

public class Main {
    public static void main(String[] args) {
        FoodFactory factory = new FoodFactory ();

        Food food1 = factory.getFood ("Vegetable", 4);
        Food food2 = factory.getFood ("Dairy", 8);
        Food food3 = factory.getFood ("Salami", 12);


        food1.buy (30, 5);
        food2.buy (30, 5);
        food3.buy (30, 2);

        food1.eat ();
        food2.prepare (4);
    }
}
