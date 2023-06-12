package ConstructorProblem07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String date = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());

        Reseat reseat = new Reseat(date, amount, tax);

        System.out.println(reseat.getDate() + " " + reseat.getAmount() + " " + reseat.getTax());

    }
}
