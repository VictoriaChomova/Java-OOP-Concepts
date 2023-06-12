package Ex6;

public class Semicircle extends Figure {
    double radius;

@Override
    public void calculatePerimeter(double r) {
        this.perimeter = r * Math.PI;
        System.out.println (perimeter);
    }
@Override
    public void calculateArea(double r) {
        this.area = (r * r * Math.PI) / 2;
        System.out.println (area);
    }
}