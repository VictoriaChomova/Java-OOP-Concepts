package Problem4;

public class Triangle {

    public double a;
    public double b;
    public double c;

    public double h;
    public double perimeter;

    public double area;

    public double triangleArea() {
        if (a > 0 && h > 0) {
            return area = (a * h) / 2;
        } else {
            return area = -1;
        }
    }
}
