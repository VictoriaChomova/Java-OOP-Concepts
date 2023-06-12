package Ex4;

public class Computer {
    String brand;
    String model;
    double price;

    Computer(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void display() {
        System.out.println(brand + " " + model + " - $" + price);
    }
}