package ConstructorProblem05;

public class Time {
    private int hour;
    private int minute;
    private int second;
    private int millisecond;


    public Time() {

    }

    public Time(int hour, int minute, int second, int millisecond) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.millisecond = millisecond;
    }

    public void setHour(int hour) {

        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setMillisecond(int millisecond) {
        this.millisecond = millisecond;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public int getMillisecond() {
        return this.millisecond;
    }
}
