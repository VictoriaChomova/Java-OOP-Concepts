package FoodFactory;

public class Vegetable implements Food{
    private double price;

    public Vegetable (double price) {
        this.price = price;

    }

    public void buy(double money, int quantity){
        if (quantity * price > money) {
            System.out.println ("Not enough money!");
        } else {
            System.out.println ("You bought " + quantity + " vegetables.");
        }
    }

    public void eat(){
        System.out.println ("You are eating a vegetable.");
    }

    public void prepare(int quantity){
        System.out.println ("Prepare " + quantity + " salads.");
    }
}
