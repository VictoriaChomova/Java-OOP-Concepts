package ConstructorProblem03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] s = new Student[4];

        for (int i = 0; i < 4; i++) {
            s[i] = new Student();
            s[i].firstName = scanner.nextLine();
            s[i].lastName = scanner.nextLine();
            s[i].grade = Integer.parseInt(scanner.nextLine());
            s[i].gender = scanner.nextLine();
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(s[i].getFirstName());
            System.out.println(s[i].getLastName());
            System.out.println(s[i].getGrade());
            System.out.println(s[i].getGender());
        }
    }
}
