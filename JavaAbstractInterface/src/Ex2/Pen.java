package Ex2;

public abstract class Pen {
    private String color;

    public Pen(String color) {
        this.color = color;
    }

    public abstract void write();

    public abstract void refill();
}
