package MethodsProblem06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double p = Double.parseDouble(scanner.nextLine());
        double q = Double.parseDouble(scanner.nextLine());
        Equation.makeEquation(p,q);
    }
}
