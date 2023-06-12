package Ex3;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator ();
        calc.balance = 300;
        calc.interest = 0.04;
        calc.months = 24;

        calc.compound (calc.balance);

        calc.compound (calc.balance, 12);
    }
}
