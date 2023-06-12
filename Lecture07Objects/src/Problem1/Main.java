package Problem1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rational a = new Rational();
        Rational b = new Rational();
        Rational c = new Rational();

        System.out.println("Please enter the numerator and denominator of the first number.");
        a.numerator = scanner.nextInt();
        a.denominator = scanner.nextInt();

        System.out.println("Please enter the numerator and denominator of the second number.");
        b.numerator = scanner.nextInt();
        b.denominator = scanner.nextInt();

        c.numerator = a.numerator * b.denominator + b.numerator * a.denominator;
        c.denominator = a.denominator * b.denominator;

        System.out.print("The sum of the numbers is: ");
        System.out.println(a.numerator + "/" + a.denominator + "+" + b.numerator + "/" + b.denominator + "=" + c.numerator + "/" + c.denominator);

        c.numerator = a.numerator * b.denominator - b.numerator * a.denominator;
        c.denominator = a.denominator * b.denominator;

        System.out.print("The difference of the numbers is: ");
        System.out.println(a.numerator + "/" + a.denominator + "-" + b.numerator + "/" + b.denominator + "=" + c.numerator + "/" + c.denominator );

    }
}
