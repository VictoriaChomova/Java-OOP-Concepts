package ConstructorProblem06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int dayOfMonth = Integer.parseInt(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();
        int year = Integer.parseInt(scanner.nextLine());

        Date todaysDate = new Date(dayOfMonth, month, dayOfWeek, year);

        System.out.printf("Today is %d.%d.%d, %s", dayOfMonth, month, year, dayOfWeek);
    }
}
