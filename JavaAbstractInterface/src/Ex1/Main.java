package Ex1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat ("Tom");
        Cat cat2 = new Cat ();
        Spider spider = new Spider ();
        Fish fish = new Fish ("Nemo");
        Fish fish2 = new Fish ();

        cat.eat ();
        System.out.println (cat.getName ());
        cat2.setName ("Garfield");
        cat.play ();
        cat.walk ();

        spider.eat ();
        spider.walk ();

        System.out.println (fish.getName ());
        fish2.setName ("Dory");
        fish.eat ();
        fish.play ();
        fish.walk ();

        Fish d = new Fish ();
        d.setName ("fishy");
        System.out.println (d.getName ());

        Cat c = new Cat ("Fluffy");
        System.out.println (c.getName ());

        Animal a = new Fish ();
        a.walk ();
        Animal e = new Spider ();

        Pet p = new Cat ();
        p.setName ("kitty");
        System.out.println (p.getName ());
        p.play ();
    }
}
