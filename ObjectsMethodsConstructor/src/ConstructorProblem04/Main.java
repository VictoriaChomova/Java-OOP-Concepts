package ConstructorProblem04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c= Double.parseDouble(scanner.nextLine());

        Triangle t = new Triangle(a, b, c);

        System.out.println(t.getA());
        System.out.println(t.getB());
        System.out.println(t.getC());


    }
}