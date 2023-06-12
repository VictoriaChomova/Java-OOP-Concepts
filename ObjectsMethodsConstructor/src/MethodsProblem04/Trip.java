package MethodsProblem04;

public class Trip {
    public int days;
    public int beds;

    public double calcPrice(){
        double bedPrice = 25;
        double ticketPrice = 40;
        return bedPrice * this.beds * this.days + ticketPrice * 2;
    }
}
