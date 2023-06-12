package Ex2;

public class Square extends Figure {
    double side;


    public Square(double a) {
        this.side = a;
    }

    public double calculateSquarePerimeter() {
        this.perimeter = 4 * side;
        return perimeter;
    }

    public double calculateSquareArea() {
        this.area = side * side;
        return area;
    }
}
