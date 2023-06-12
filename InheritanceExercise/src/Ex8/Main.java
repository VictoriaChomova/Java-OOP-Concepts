package Ex8;

public class Main {
    public static void main(String[] args) {

        Appetizer appetizer1 = new Appetizer("Mozzarella Sticks", 7.99);
        Appetizer appetizer2 = new Appetizer("Chicken Wings", 9.99);
        Appetizer appetizer3 = new Appetizer("Potato Skins", 8.99);

        MainCourse main1 = new MainCourse("Spaghetti and Meatballs", 12.99);
        MainCourse main2 = new MainCourse("Grilled Chicken Breast", 14.99);
        MainCourse main3 = new MainCourse("Beef Burger", 11.99);

        Salad salad1 = new Salad("Caesar Salad", 8.99);
        Salad salad2 = new Salad("Greek Salad", 9.99);
        Salad salad3 = new Salad("Caprese Salad", 7.99);

        Dessert dessert1 = new Dessert("New York Cheesecake", 6.99);
        Dessert dessert2 = new Dessert("Chocolate Brownie Sundae", 8.99);
        Dessert dessert3 = new Dessert("Ice Cream Cone", 3.99);

        System.out.println("Welcome to our restaurant!");
        System.out.println("Here's our menu:");

        System.out.println("\nAppetizers:");
        appetizer1.display();
        appetizer2.display();
        appetizer3.display();

        System.out.println("\nMain Dishes:");
        main1.display();
        main2.display();
        main3.display();

        System.out.println("\nSalads:");
        salad1.display();
        salad2.display();
        salad3.display();

        System.out.println("\nDesserts:");
        dessert1.display();
        dessert2.display();
        dessert3.display();

        salad1.buy(2,50);
        salad1.buy(12,10);

    }
}