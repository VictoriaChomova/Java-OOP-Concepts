package MethodsProblem05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pizzaPrice = Double.parseDouble(scanner.nextLine());
        int pizzaAmount = Integer.parseInt(scanner.nextLine());
        double drinkPrice = Double.parseDouble(scanner.nextLine());
        int drinksAmount = Integer.parseInt(scanner.nextLine());

        Order.calcPrice(pizzaPrice, pizzaAmount, drinkPrice, drinksAmount);
    }
}
