package Ex4;

import java.util.ArrayList;
import java.util.List;

public class ShopList <S extends Shop> {

    List <S> shopList;

    public ShopList () {
        this.shopList = new ArrayList<> ();
    }


    public void addShop (S shop) {
        this.shopList.add (shop);
    }

    public void removeShop(S shop) {
        this.shopList.remove (shop);
    }

    public void printList() {
        for (S shop: shopList) {
            shop.printShop ();
        }
    }
    public String getShop(S shop) {
        return shop.getType ();
    }
}
