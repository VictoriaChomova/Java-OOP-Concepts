package MethodsProblem05;

public class Order {


    public static void calcPrice(double pizzaPrice, int pizzaAmount, double drinkPrice, int drinksAmount) {
        double delivery = 4.5;
        double totalPrice = 0;
        if (pizzaPrice > 0 && pizzaAmount > 0 && drinkPrice > 0 && drinksAmount > 0) {
            totalPrice = pizzaPrice * pizzaAmount + drinkPrice * drinksAmount + delivery;
            System.out.println("Total price: " + totalPrice + "lv.");
        } else {
            System.out.println("Invalid input!");
        }
    }
}
