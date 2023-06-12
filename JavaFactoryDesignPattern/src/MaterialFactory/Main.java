package MaterialFactory;

public class Main {
    public static void main(String[] args) {


        MaterialFactory factory = new MaterialFactory ();

        Material material1 = factory.getMaterial ("Concrete");
        Material material2 = factory.getMaterial ("Wood");
        Material material3 = factory.getMaterial ("Granit");

        material1.getPrice ();
        material1.build (140000, "house");
        material1.getQuality ();
    }
}
