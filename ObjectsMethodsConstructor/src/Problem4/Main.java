package Problem4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double h = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            Triangle triangle = new Triangle();
            triangle.a = a;
            triangle.b = b;
            triangle.c = c;
            triangle.h = h;
            triangle.perimeter = a + b + c;
            triangle.area = triangle.triangleArea();
            System.out.println("The perimeter is " + triangle.perimeter + "cm.");
            System.out.println("The area is " + triangle.triangleArea() + "sq. cm.");
        } else {
            System.out.println("Invalid input.");
        }


    }
}
