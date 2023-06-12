package Ex5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TV implements SmartTvRemote{
    private boolean isOn;

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println ("The TV is turned on.");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println ("The TV is turned off.");
    }

    @Override
    public void showClock() {
        LocalDateTime time = LocalDateTime.now ();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern ("E dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = time.format (formatter);
        System.out.println (formattedDateTime);
    }

    public void show() {
        if (isOn) {
            System.out.println ("The TV is  on.");
        } else {
            System.out.println ("The TV is off.");
        }
    }
}
