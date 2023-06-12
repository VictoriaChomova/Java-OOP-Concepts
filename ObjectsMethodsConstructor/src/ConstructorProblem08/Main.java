package ConstructorProblem08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Laptop[] listToCompare = new Laptop[2];

        for (int i = 0; i < listToCompare.length; i++) {
            listToCompare[i] = new Laptop();

            listToCompare[i].setRam(Integer.parseInt(scanner.nextLine()));
            listToCompare[i].setCpuClock(Integer.parseInt(scanner.nextLine()));
            listToCompare[i].setCpuModel(scanner.nextLine());
            listToCompare[i].setGpuModel(scanner.nextLine());
        }

        if (Laptop.isBetter(listToCompare[0], listToCompare[1])) {
            System.out.println("First laptop is better!");
        } else {
            System.out.println("Second laptop is better!");
        }
    }
}
