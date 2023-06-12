package MaterialFactory;

import FoodFactory.Dairy;
import FoodFactory.Salami;
import FoodFactory.Vegetable;

public class MaterialFactory {

    public Material getMaterial(String materialType) {
        if (materialType.equals ("Concrete")) {
            return new Concrete ();
        } else if (materialType.equals ("Wood")) {
            return new Wood ();
        } else if (materialType.equals ("Granit")) {
            return new Granit ();
        }
        return null;
    }
}
