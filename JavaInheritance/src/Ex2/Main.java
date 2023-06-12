package Ex2;

public class Main {
    public static void main(String[] args) {
        int r = 4;

        Circle ci = new Circle (r);

        ci.area = ci.calculateCircleArea ();
        ci.perimeter = ci.calculateCirclePerimeter ();
        System.out.println ("Circle:");
        ci.show ();


        Semicircle sc = new Semicircle (r);

        sc.area = sc.calculateSemicircleArea ();
        sc.perimeter = sc.calculateSemicirclePerimeter ();
        System.out.println ("Semicircle:");
        sc.show ();


        double sideA = 5;
        double sideB = 8;
        Rectangle re = new Rectangle (sideA, sideB);

        re.area = re.calculateRectangleArea ();
        re.perimeter = re.calculateRectanglePerimeter ();
        System.out.println ("Rectangle:");
        re.show ();


        Square sq = new Square (sideA);

        sq.area = sq.calculateSquareArea ();
        sq.perimeter = sq.calculateSquarePerimeter ();
        System.out.println ("Square:");
        sq.show ();

        double a = 3;
        double b = 4;
        double c = 5;
        double ha = 2;

        Triangle tr = new Triangle (a, b, c, ha);

        tr.area = tr.calculateTriangleArea ();
        tr.perimeter = tr.calculateTrianglePerimeter ();
        System.out.println ("Triangle:");
        tr.show ();


        double radiusA = 3;
        double radiusB = 6;

        Ellipse el = new Ellipse (radiusA, radiusB);

        el.area = el.calculateEllipseArea ();
        el.perimeter = el.calculateEllipsePerimeter ();
        System.out.println ("Ellipse:");
        el.show ();

        double d = 4;
        double h = 6;

        Trapezoid trap = new Trapezoid (a, b, c, d, h);

        trap.area = trap.calculateTrapezoidArea ();
        trap.perimeter = trap.calculateTrapezoidPerimeter ();
        System.out.println ("Trapezoid:");
        trap.show ();


    }
}
