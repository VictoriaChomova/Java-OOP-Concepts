package ConstructorProblem05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ConstructorProblem05.Time currentTime = new Time();

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int seconds = Integer.parseInt(scanner.nextLine());
        int millisec = Integer.parseInt(scanner.nextLine());

        if (hour < 24 && hour >= 0 && minutes < 60 && minutes >= 0 && seconds < 60 && seconds >= 0 && millisec < 1000 && millisec >= 0) {
           currentTime.setHour(hour);
           currentTime.setMinute(minutes);
           currentTime.setSecond(seconds);
           currentTime.setMillisecond(millisec);
        } else {
            System.out.println("Invalid input!");
        }

        System.out.println(currentTime.getHour() + ":" + currentTime.getMinute() + ":" + currentTime.getSecond() + ":" + currentTime.getSecond());
    }
}
