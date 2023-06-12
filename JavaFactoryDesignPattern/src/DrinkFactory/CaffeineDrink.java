package DrinkFactory;

public class CaffeineDrink implements Drink {
    private double price;

    public CaffeineDrink(double price) {
        this.price = price;
    }

    public void buy(double money, int quantity) {
        if (quantity * this.price > money) {
            System.out.println ("Not enough money.");
        } else {
            System.out.println ("You bought " + quantity + " soft drinks.");
        }

    }
    public void drink(){
        System.out.println ("The drink is Caffeine Drink.");
    }
}
