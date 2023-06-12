package MethodsProblem03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee newEmployee = new Employee();

        newEmployee.fistName = scanner.nextLine();
        newEmployee.lastName = scanner.nextLine();
        newEmployee.age = Integer.parseInt(scanner.nextLine());
        newEmployee.position = scanner.nextLine();

        newEmployee.printEmployee();
    }
}
