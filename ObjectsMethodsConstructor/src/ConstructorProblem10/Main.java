package ConstructorProblem10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight = Double.parseDouble(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        boolean isUrgent = scanner.hasNext();

        Delivery delivery = new Delivery(weight, price, isUrgent);
        Delivery.printDelivery(weight, price, isUrgent);
    }
}
