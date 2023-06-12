package ConstructorProblem07;

public class Reseat {
    private String date;
    private int amount;
    private double tax;

    public Reseat(String date, int amount, double tax) {
        this.date = date;
        this.amount = amount;
        this.tax = tax;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}

