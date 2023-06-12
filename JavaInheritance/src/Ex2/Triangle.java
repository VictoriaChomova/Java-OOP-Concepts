package Ex2;

public class Triangle extends Figure{
    double a;
    double b;
    double c;
    double ha;


    public Triangle(double a, double b, double c, double ha) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.ha = ha;
    }

    public double calculateTrianglePerimeter() {
        this.perimeter = a + b + c;
        return perimeter;
    }

    public double calculateTriangleArea() {
        this.area = (a * ha) / 2;
        return area;
    }
}
