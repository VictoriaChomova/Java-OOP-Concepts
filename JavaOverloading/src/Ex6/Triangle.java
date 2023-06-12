package Ex6;

public class Triangle extends Figure{
    double a;
    double b;
    double c;
    double ha;



    public void calculatePerimeter(double a, double b, double c) {
        this.perimeter = a + b + c;
        System.out.println (perimeter);
    }

    public void calculateArea(double a, double ha) {
        this.area = (a * ha) / 2;
        System.out.println (area);
    }
}

