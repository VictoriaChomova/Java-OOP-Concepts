package Problem2;

public class Point {
    public double x;
    public double y;

    public static double distance(double x1, double y1, double x2, double y2) {
        double a = Math.abs(x1 - x2);
        double b = Math.abs(y1 - y2);
        return Math.sqrt(a*a + b*b);
    }
}
