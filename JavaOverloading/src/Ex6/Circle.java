package Ex6;

public class Circle extends Figure{

    double radius;


    @Override
    public void calculatePerimeter(double r) {
        perimeter = 2 * r * Math.PI;
        System.out.println (perimeter);
    }
@Override
    public void calculateArea(double r) {
        area = r * r * Math.PI;
    System.out.println (area);
    }
}
