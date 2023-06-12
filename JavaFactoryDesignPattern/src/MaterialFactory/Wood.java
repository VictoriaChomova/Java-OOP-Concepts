package MaterialFactory;

public class Wood extends BuildingMaterial implements Material{
    private String materialType;

    public Wood() {
        super(250, "medium");
        this.materialType = "Wood";
    }

    public void build(double buildingPrice, String building) {
        System.out.println ("The building is " + building + " and it's price is " + buildingPrice + "$");
    }
    public void getQuality() {
        System.out.println ("The quality of the material is " + this.quality);
    }
    public void getPrice(){
        System.out.println ("The price of the material is " + this.price + "$");
    }
}
