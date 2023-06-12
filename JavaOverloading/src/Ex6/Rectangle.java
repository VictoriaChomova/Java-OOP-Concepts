package Ex6;

public class Rectangle extends Figure{
    double sideA;
    double sideB;


    public void calculatePerimeter(double a, double b) {
        this.perimeter = 2 * a + 2 * b;
        System.out.println (perimeter);
    }

    public void calculateArea(double a, double b) {
        this.area = a * b;
        System.out.println (area);
    }
}
