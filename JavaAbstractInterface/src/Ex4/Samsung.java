package Ex4;

public class Samsung extends Smartphone{

    @Override
    public void lift () {
        System.out.println ("Hello Samsung!");
    }

    @Override
    public void disconnected() {
        System.out.println ("Disconnect samsung");
    }
}
