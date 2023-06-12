package Ex6;

public class Square extends Figure {
    double side;


@Override
    public void calculatePerimeter(double a) {
        this.perimeter = 4 * a;
        System.out.println (perimeter);
    }
@Override
    public void calculateArea(double a) {
        this.area = a * a ;
        System.out.println (area);
    }
}
