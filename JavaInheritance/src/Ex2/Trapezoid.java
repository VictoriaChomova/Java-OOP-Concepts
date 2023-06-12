package Ex2;

public class Trapezoid extends  Figure{
    double a;
    double b;
    double c;

    double d;

    double h;


    public Trapezoid(double a, double b, double c, double d, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }

    public double calculateTrapezoidPerimeter() {
        this.perimeter = a + b + c + b;
        return perimeter;
    }

    public double calculateTrapezoidArea() {
        this.area = (a+b)/2 * h;
        return area;
    }
}
