package Ex2;

public class Semicircle extends Figure {
    double radius;


    public Semicircle(double r) {
        this.radius = r;
    }

    public double calculateSemicirclePerimeter() {
        this.perimeter = radius * Math.PI;
        return perimeter;
    }

    public double calculateSemicircleArea() {
        this.area = (radius * radius * Math.PI) / 2;
        return area;
    }
}
