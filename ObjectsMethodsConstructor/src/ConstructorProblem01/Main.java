package ConstructorProblem01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r1Num = Integer.parseInt(scanner.nextLine());
        int r1Denom = Integer.parseInt(scanner.nextLine());
        int r2Num = Integer.parseInt(scanner.nextLine());
        int r2Denom = Integer.parseInt(scanner.nextLine());

        Rational rat1 = new Rational(r1Num, r1Denom);
        Rational rat2 = new Rational(rat1);

        rat2.setNumerator(r2Num);
        rat2.setDenominator(r2Denom);



    }
}
