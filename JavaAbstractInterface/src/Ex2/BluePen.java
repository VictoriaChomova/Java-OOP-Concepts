package Ex2;

public class BluePen extends Pen{

    private double thickness;

    public BluePen(double thickness) {
        super("blue");
        this.thickness = thickness;
    }

    public void write() {
        System.out.println ("This pen writes blue.");
    }

    public void refill() {
        System.out.println ("Refill this pen with blue ink.");
    }
}
