package Ex4;

public abstract class Shop {
    String type;
    String address;
    double profit;
    String typeOfGoods;

    public Shop (String type, String address, double profit, String typeOfGoods) {
        this.type = type;
        this.address = address;
        this.profit = profit;
        this.typeOfGoods = typeOfGoods;
    }

    public String getType() {
        return this.type;
    }

    public void printShop() {
        System.out.println ( type + ":\nAddress: " + address + "\nProfit: " + profit + "\nType of goods: " + typeOfGoods + "\n");
    }
    public abstract void sell();
}
