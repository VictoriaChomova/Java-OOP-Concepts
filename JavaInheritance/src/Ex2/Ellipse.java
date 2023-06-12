package Ex2;

public class Ellipse extends Figure{
    double radiusA;
    double radiusB;


    public Ellipse(double a, double b) {
        this.radiusA = a;
        this.radiusB = b;
    }

    public double calculateEllipsePerimeter() {
        this.perimeter = radiusA * radiusB * Math.PI;
        return perimeter;
    }

    public double calculateEllipseArea() {
        this.area = 2 * Math.PI * Math.sqrt (radiusA*radiusA + radiusB*radiusB)/2;
        return area;
    }
}
