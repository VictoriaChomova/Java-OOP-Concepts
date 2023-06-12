package MethodsProblem07;

public class Triplet {

    public static boolean checkP(double a, double b, double c) {
        if (c*c == a*a + b*b || b*b == a*a + c*c || a*a == b*b + c*c) {
            return true;
        } else {
            return false;
        }
    }
}
