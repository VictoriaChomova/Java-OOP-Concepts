package ConstructorProblem10;

public class Delivery {
    private double packageWeight;
    private double packagePrice;
    private boolean isUrgent;


    public Delivery(double packageWeight, double packagePrice, boolean isUrgent) {
        this.packageWeight = packageWeight;
        this.packagePrice = packagePrice;
        this.isUrgent = isUrgent;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    public double getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(double packagePrice) {
        this.packagePrice = packagePrice;
    }

    public boolean isUrgent() {
        return isUrgent;
    }

    public void setUrgent(boolean urgent) {
        isUrgent = urgent;
    }

    public static void printDelivery (double packageWeight, double packagePrice, boolean isUrgent) {
        System.out.printf("Package weight: %f%nPackage price: %f%n", packageWeight, packagePrice);
        if (isUrgent) {
            System.out.printf("Package is urgent.");
        } else {
            System.out.printf("Package is not urgent.");
        }
    }
}
