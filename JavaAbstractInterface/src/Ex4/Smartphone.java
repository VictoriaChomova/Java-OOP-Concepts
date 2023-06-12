package Ex4;

public class Smartphone extends Phone{

    public void lift() {
        System.out.println ("Hello");
    }

    @Override
    public void disconnected() {
        System.out.println ("Disconnect");
    }
}
