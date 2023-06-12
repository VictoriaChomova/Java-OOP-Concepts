package Ex4;

public class Main {
    public static void main(String[] args) {
        Cleaner cleaner = new Cleaner ("Maria", "Petkova", 800, 10);
        cleaner.show ();
        Accountant accountant = new Accountant ("Ivana", "Ivanova", 1200, 8);
        accountant.show ();
        Developer developer = new Developer ("Ivan", "Ivanov", 5000, 3);
        developer.show ();
        Manager manager = new Manager ("Viktoria", "Nikolaeva", 6000, 9);
        manager.show ();
        PR pr = new PR ("Georgi", "Georgiev", 3500, 6);
        pr.show ();

    }
}
