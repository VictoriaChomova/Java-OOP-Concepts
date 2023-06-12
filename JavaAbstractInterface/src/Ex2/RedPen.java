package Ex2;

public class RedPen extends Pen{
    private double thickness;

    public RedPen(double thickness) {
        super("red");
        this.thickness = thickness;
    }

    public void write() {
        System.out.println ("This pen writes red.");
    }

    public void refill() {
        System.out.println ("Refill this pen with red ink.");
    }
}
