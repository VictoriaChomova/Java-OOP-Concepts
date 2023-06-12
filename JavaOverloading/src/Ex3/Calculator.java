package Ex3;

public class Calculator {
    double balance;
    double interest;
    int months;

    public double compound(double balance) {

        balance = balance * (1 + this.interest);
        System.out.println (balance);


        return balance;
    }

    public double compound(double balance, int months) {
        balance = Math.pow (balance * (1 + this.interest), months);
        System.out.println (balance);
        return balance;
    }


}
