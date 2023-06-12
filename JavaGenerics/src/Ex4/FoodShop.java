package Ex4;

public class FoodShop extends Shop{

    String address;
    double profit;
    String typeOfGoods;

    public FoodShop(String address, double profit) {
        super("Food shop", address, profit, "food");
    }

    public void sell() {
        System.out.println ("Selling food");
    }
}
