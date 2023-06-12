package Problem3;

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
            System.out.println("Student " + i + ":");
            System.out.println(s[i].firstName);
            System.out.println(s[i].lastName);
            System.out.println(s[i].grade);
            System.out.println(s[i].gender);
        }


    }
}
