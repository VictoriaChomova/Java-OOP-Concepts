package FoodFactory;

public class Salami implements Food{
    private double price;

    public Salami (double price) {
        this.price = price;

    }

    public void buy(double money, int quantity){
        if (quantity * price > money) {
            System.out.println ("Not enough money!");
        } else {
            System.out.println ("You bought " + quantity + " salami products.");
        }
    }

    public void eat(){
        System.out.println ("You are eating a salami.");
    }

    public void prepare(int quantity){

        System.out.println ("Prepare " + quantity + " salami sandwiches.");
    }
}
