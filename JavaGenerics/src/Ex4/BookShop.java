package Ex4;

public class BookShop extends Shop{
    String address;
    double profit;
    String typeOfGoods;

    public BookShop(String address, double profit) {
        super("Book shop", address, profit, "books");
    }

    public void sell() {
        System.out.println ("Selling books");
    }
}
