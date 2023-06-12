package MaterialFactory;

public abstract class BuildingMaterial {
    double price;
    String quality;

    public BuildingMaterial(double price, String quality) {
        this.price = price;
        this.quality = quality;

    }

    public void printMaterial(String materialType, double price, String quality) {
        System.out.printf ("Material: %s%nPrice: %.2f%nQuality: %s%n", materialType, price, quality);
    }
}
