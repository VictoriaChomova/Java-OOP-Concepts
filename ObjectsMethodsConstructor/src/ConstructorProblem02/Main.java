package ConstructorProblem02;

import Problem2.Point;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Problem2.Point first = new Problem2.Point();
        Problem2.Point second = new Problem2.Point();

        System.out.println("First point.");
        System.out.print("x:");
        first.x = scanner.nextDouble();
        System.out.print("y:");
        first.y = scanner.nextDouble();

        System.out.println("Second point.");
        System.out.print("x:");
        first.x = scanner.nextDouble();
        System.out.print("y:");
        first.y = scanner.nextDouble();

        double distance = Point.distance(first.x, first.y, second.x, second.y);

        System.out.printf("The distance between the points is: %.2f", distance);



    }
}
