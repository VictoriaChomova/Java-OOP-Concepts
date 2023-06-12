package ConstructorProblem06;

public class Date {
    private int dayOfMonth;
    private int month;
    private String dayOfWeek;
    private int year;

    public Date() {

    }

    public Date(int dayOfMonth, int month, String dayOfWeek, int year) {
        if (dayOfMonth > 0 && dayOfMonth <= 31 && month > 0 && month <= 12 && year > 0 && year < 2024) {
            this.dayOfMonth = dayOfMonth;
            this.month = month;
            this.dayOfWeek = dayOfWeek;
            this.year = year;
        } else {
            System.out.println("Invalid input!");
        }
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public int getMonth() {
        return month;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public int getYear() {
        return year;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
