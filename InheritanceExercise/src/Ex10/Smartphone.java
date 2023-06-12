package Ex10;

class Smartphone {

    public String brand;
    public String model;
    public double price;

    Smartphone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println(brand + " " + model + " - $" + price);
    }
}