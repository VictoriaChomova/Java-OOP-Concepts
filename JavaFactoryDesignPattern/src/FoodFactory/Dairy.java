package FoodFactory;

public class Dairy implements Food{
    private double price;

    public Dairy (double price) {
        this.price = price;

    }

    public void buy(double money, int quantity){
        if (quantity * price > money) {
            System.out.println ("Not enough money!");
        } else {
            System.out.println ("You bought " + quantity + " dairy products.");
        }
    }

    public void eat(){
        System.out.println ("You are eating a dairy product.");
    }

    public void prepare(int quantity){
        System.out.println ("Prepare " + quantity + " cups of milk.");
    }
}
