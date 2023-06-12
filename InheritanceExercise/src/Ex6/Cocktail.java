package Ex6;

class Cocktail extends Drink {
    public boolean hasAlcohol;
    Cocktail(String name, double price, boolean hasAlcohol) {
        super(name, "Cocktail", price);
        this.hasAlcohol= hasAlcohol;
    }
}