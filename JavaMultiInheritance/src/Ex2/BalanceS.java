package Ex2;

public class BalanceS extends SavingAccount{
    public double amount;


    public BalanceS(String holderNames, String holderEGN, String currency, double amount) {
        super (holderNames, holderEGN, currency);
        this.minSum = 20;
        this.tax = 4.5;
        this.status = true;
        this.amount = amount;
    }

    public void showBalance () {
        System.out.println ("Balance: " + amount);
    }

    public void depositMoney(int amountToDeposit) {
        this.amount += amountToDeposit;
        System.out.println (amountToDeposit + currency + " deposited successfully." );
    }
}
