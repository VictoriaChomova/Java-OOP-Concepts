package DrinkFactory;

public class AlcoholicDrink implements Drink{
    private double price;

    public AlcoholicDrink(double price) {
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
        System.out.println ("The drink is Alcoholic Drink.");
    }

}
