package Ex2;

public class Main {
    public static void main(String[] args) {
        RedPen rp = new RedPen (0.5);
        rp.write ();
        rp.refill ();

        BluePen bp = new BluePen (0.8);
        bp.write ();
        bp.refill ();
    }
}
