package Ex6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Drink> drinks = new ArrayList<Drink> ();

        drinks.add(new SoftDrink("Coca-Cola", 2.5));
        drinks.add(new SoftDrink("Sprite", 2));
        drinks.add(new Cocktail("Virgin Margarita", 8, false));
        drinks.add(new Cocktail("Cosmopolitan", 10, true));
        drinks.add(new Spirit("Vodka", 6));
        drinks.add(new Spirit("Whiskey", 8));
        drinks.add(new SoftDrink("Fanta", 2));
        drinks.add(new Cocktail("Long Island Iced Tea", 12, false));
        drinks.add(new SoftDrink("Ginger Ale", 2.5));
        drinks.add(new Spirit("Gin", 7));
        drinks.add(new SpiritCocktail("Gin", 7));

        System.out.println("Drinks:");
        for (Drink drink : drinks) {
            System.out.println(drink.getName() + " - " + drink.getType() + " - " + drink.getPrice());
        }
    }
}