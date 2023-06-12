package Ex4;


public class Main {
    public static void main(String[] args) {

        Dell dell1 = new Dell("Inspiron 15", 699.99);
        Dell dell2 = new Dell("XPS 13", 1299.99);
        Dell dell3 = new Dell("G5 Gaming Desktop", 999.99);
        Dell dell4 = new Dell("Alienware m15 R4", 1999.99);

        HP hp1 = new HP("Pavilion x360 Convertible", 699.99);
        HP hp2 = new HP("Envy 13", 1099.99);
        HP hp3 = new HP("Omen Obelisk Desktop", 1399.99);
        Lenovo lenovo1 = new Lenovo("IdeaPad 3", 399.99);
        Lenovo lenovo2 = new Lenovo("ThinkPad X1 Carbon", 1699.99);
        Lenovo lenovo3 = new Lenovo("Legion 5 Gaming Laptop", 1099.99);
        Lenovo lenovo4 = new Lenovo("Yoga 9i 2-in-1", 1449.99);

        System.out.println("Welcome to our computer store!");
        System.out.println("Here's our menu:");

        System.out.println("\nDell:");
        dell1.display();
        dell2.display();
        dell3.display();
        dell4.display();

        System.out.println("\nHP:");
        hp1.display();
        hp2.display();
        hp3.display();

        System.out.println("\nLenovo:");
        lenovo1.display();
        lenovo2.display();
        lenovo3.display();
        lenovo4.display();
    }
}