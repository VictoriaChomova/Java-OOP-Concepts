package MethodsProblem04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Trip myTrip = new Trip();

        myTrip.days = Integer.parseInt(scanner.nextLine());
        myTrip.beds = Integer.parseInt(scanner.nextLine());

        double totalPrice = myTrip.calcPrice();
        System.out.println("Total price: " + totalPrice + "lv.");
    }
}
