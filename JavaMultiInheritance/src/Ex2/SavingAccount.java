package Ex2;

public class SavingAccount extends Account{
    public int minSum;
    public double tax;
    public boolean status;


    public SavingAccount (String holderNames, String holderEGN, String currency) {
        super(holderNames, holderEGN, currency, "Saving");
        this.minSum = 20;
        this.tax = 4.5;
        this.status = false;
    }

    @Override
    public void showDetails () {
        System.out.println ("Name: " + this.holderNames + "\nEGN: " + this.holderEGN + "\nCurrency: " + this.currency
                + "\nType: " + this.type + "\nMinimum sum: " + this.minSum + "\nTax: " + this.tax + "\nStatus: " + this.status);
    }
}
