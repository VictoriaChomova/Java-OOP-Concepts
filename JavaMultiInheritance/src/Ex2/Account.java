package Ex2;

public class Account {
    public String holderNames;
    public String holderEGN;
    public String currency;
    public String type;


    public Account(String holderNames, String holderEGN, String currency, String type) {
        this.holderNames = holderNames;
        this.holderEGN = holderEGN;
        this.currency = currency;
        this.type = type;
    }

    public void showDetails () {
        System.out.println ("Name: " + this.holderNames + "\nEGN: " + this.holderEGN + "\nCurrency: " + this.currency
        + "\nType: " + this.type);
    }
}
