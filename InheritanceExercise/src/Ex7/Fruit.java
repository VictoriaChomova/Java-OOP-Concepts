package Ex7;

class Fruit extends Product {
    public Fruit(String name, double price) {
        super(name, price);
    }
    @Override
    public void display(){
        System.out.println(this.getName () + " - $ " + this.getPrice ());
    }
}