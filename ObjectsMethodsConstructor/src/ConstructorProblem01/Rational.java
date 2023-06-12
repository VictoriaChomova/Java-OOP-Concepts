package ConstructorProblem01;

public class Rational {
    private int numerator;
    private int denominator;


    public Rational (int num, int denom) {
        this.numerator = num;
        this.denominator = denom;
    }

    public Rational (Rational r1) {
        this.numerator = r1.numerator;
        this.denominator = r1.denominator;
    }

    public int getNum () {
        return numerator;
    }

    public int getDenom () {
        return denominator;
    }

    public void setNumerator (int num) {
        this.numerator = num;
    }

    public void setDenominator (int denom) {
        this.denominator = denom;
    }

    public static void sumRational (Rational r1, Rational r2) {
        int r1num = r1.getNum();
        int r1denom = r1.getDenom();
        int r2num = r2.getNum();
        int r2denom = r2.getDenom();

        int sum = (r1num*r2denom);
    }
}
