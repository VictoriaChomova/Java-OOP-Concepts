package Ex4;

public class Main {
    public static void main(String[] args) {


        ShopList<Shop> shopList = new ShopList<> ();

        BookShop bs = new BookShop ("8 Main str.", 22000);
        FlowerShop fs = new FlowerShop ("23 Oak str ", 12000);
        FoodShop foSh = new FoodShop ("57 John ale", 24000);

        foSh.sell ();

        shopList.addShop (bs);
        shopList.addShop (fs);
        shopList.addShop (foSh);

        shopList.printList ();

        System.out.println (shopList.getShop (bs));




    }
}