package Ex6;

public class Ellipse extends Figure {
    double radiusA;
    double radiusB;



    public void calculatePerimeter(double rA, double rB) {
        this.perimeter = rA * rB * Math.PI;
        System.out.println (perimeter);
    }


    public void calculateArea(double radiusA, double radiusB) {
        this.area = 2 * Math.PI * Math.sqrt (radiusA * radiusA + radiusB * radiusB) / 2;
        System.out.println (area);
    }
}
