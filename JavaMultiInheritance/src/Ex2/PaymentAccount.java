package Ex2;

public class PaymentAccount extends Account{
    public int minSum;
    public double tax;
    public boolean status;


    public PaymentAccount (String holderNames, String holderEGN, String currency) {
        super(holderNames, holderEGN, currency, "Payment");
        this.minSum = 10;
        this.tax = 5.5;
        this.status = false;
    }

    @Override
    public void showDetails () {
        System.out.println ("Name: " + this.holderNames + "\nEGN: " + this.holderEGN + "\nCurrency: " + this.currency
                + "\nType: " + this.type + "\nMinimum sum: " + this.minSum + "\nTax: " + this.tax + "\nStatus: " + this.status);
    }


}
