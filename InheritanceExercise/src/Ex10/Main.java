package Ex10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter samsung phone");
        Samsung samsung1 = new Samsung(s.nextLine (), s.nextDouble ());
        System.out.println("Enter apple phone");

        Apple apple1 = new Apple(s.next(), s.nextDouble());

        System.out.println("Enter google phone");

        Google google1 = new Google(s.next(), s.nextDouble());


        System.out.println("Welcome to our smartphone store!");
        System.out.println("Here's our menu:");

        System.out.println("\nSamsung:");
        samsung1.display();


        System.out.println("\nApple:");
        apple1.display();


        System.out.println("\nGoogle:");
        google1.display();

    }
}