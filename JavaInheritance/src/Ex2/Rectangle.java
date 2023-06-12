package Ex2;

public class Rectangle extends Figure{
    double sideA;
    double sideB;

    public Rectangle(double a, double b) {
        this.sideA = a;
        this.sideB = b;
    }

    public double calculateRectanglePerimeter() {
        this.perimeter = 2 * sideA + 2 * sideB;
        return perimeter;
    }

    public double calculateRectangleArea() {
        this.area = sideA * sideB;
        return area;
    }
}
