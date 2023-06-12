package Ex6;

public class Trapezoid extends  Figure{
    double a;
    double b;
    double c;

    double d;

    double h;



    public void calculatePerimeter(double a,  double b, double c, double d) {
        this.perimeter = a + b + c + d;
        System.out.println (perimeter);
    }

    public void calculateArea( double a, double b, double h) {
        this.area = (a+b)/2 * h;
        System.out.println (area);
    }
}

