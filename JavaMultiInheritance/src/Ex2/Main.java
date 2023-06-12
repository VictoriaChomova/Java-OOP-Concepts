package Ex2;

public class Main {
    public static void main(String[] args) {
        BalanceP myPA = new BalanceP ("Viktoria Chomova", "9506213993", "BGN", 3400);
        BalanceS mySA = new BalanceS ("Viktoria Chomova", "9506213993", "BGN", 2800);

        myPA.showDetails ();
        System.out.println ("");
        myPA.showBalance ();
        myPA.depositMoney (200);
        myPA.showBalance ();
        myPA.pay (850);
        myPA.showBalance ();

        System.out.println ("");

        mySA.showDetails ();
        mySA.showBalance ();
        mySA.depositMoney (500);
        mySA.showBalance ();
    }
}
