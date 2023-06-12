package Ex6;

public class Main {
    public static void main(String[] args) {


        Circle ci = new Circle ();

        System.out.println ("Circle:");
        ci.calculateArea (5);
        ;
        ci.calculatePerimeter (5);


        Semicircle sc = new Semicircle ();

        System.out.println ("Semicircle:");
        sc.calculateArea (4);
        sc.calculatePerimeter (4);


        Rectangle re = new Rectangle ();

        System.out.println ("Rectangle:");
        re.calculateArea (4, 5);
        re.calculatePerimeter (4, 5);


        Square sq = new Square ();

        System.out.println ("Square:");
        sq.calculateArea (3);
        sq.calculatePerimeter (3);


        double a = 3;
        double b = 4;
        double c = 5;
        double ha = 2;

        Triangle tr = new Triangle ();

        System.out.println ("Triangle:");
        tr.calculateArea (3, 2);
        tr.calculatePerimeter (a, b, c);



        double radiusA = 3;
        double radiusB = 6;

        Ellipse el = new Ellipse ();

        System.out.println ("Ellipse:");
        el.calculateArea (radiusA, radiusB);
        el.calculatePerimeter (radiusA, radiusB);



        double d = 4;
        double h = 6;

        Trapezoid trap = new Trapezoid ();

        System.out.println ("Trapezoid:");
        trap.calculateArea (a, b, h);
        trap.calculatePerimeter (a, b, c, d);


    }
}
