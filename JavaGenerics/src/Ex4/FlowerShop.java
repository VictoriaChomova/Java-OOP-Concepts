package Ex4;

public class FlowerShop extends Shop{
    String address;
    double profit;
    String typeOfGoods;

public FlowerShop(String address, double profit) {
    super("Flower shop", address, profit, "flowers");
}

    public void sell() {
        System.out.println ("Selling flowers.");
    }
}
