package ConstructorProblem04;

public class Triangle {
    private double a, b, c;


    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public Triangle() {

    }

    public Triangle(double a, double b, double c) {
        if (a < b + c && b < a + c && c < a + b) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            System.out.println("Such triangle cannot be made!");
        }
    }
}
