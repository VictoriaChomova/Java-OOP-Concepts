package Ex2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<> ();
        cars.add(new Toyota("Camry", 24000));
        cars.add(new Toyota("Corolla", 20000));
        cars.add(new Toyota("Prius", 28000));
        cars.add(new Honda("Civic", 22000));
        cars.add(new Honda("Accord", 26000));
        cars.add(new Ford("Mustang", 34000));
        cars.add(new Ford("Fusion", 24000));

        for (Car c : cars) {
            System.out.println(c.getBrand () + " " + c.getModel() + " - $" + c.getPrice());
        }
    }
}