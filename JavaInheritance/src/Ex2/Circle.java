package Ex2;

public class Circle extends Figure {
    double radius;


    public Circle(double r) {
        this.radius = r;
    }

    public double calculateCirclePerimeter() {
        this.perimeter = 2 * radius * Math.PI;
        return perimeter;
    }

    public double calculateCircleArea() {
        this.area = radius * radius * Math.PI;
        return area;
    }
}
