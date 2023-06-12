package Ex8;

class Food {
    String name;
    double price;
    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }
    void display() {
        System.out.println(name + " - $" + price);
    }
    void buy(int quantity, double amount){
        if (quantity*this.price > amount){
            System.out.println("Not enough money to buy this");
        }
        else{
            System.out.println("You bought "+quantity+" of "+this.name+" for "+quantity*this.price);
        }
    }
}