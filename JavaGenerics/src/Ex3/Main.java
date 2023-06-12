package Ex3;

public class Main {
    public static void main(String[] args) {
        PizzaArrayList<Pizza> pizzaList = new PizzaArrayList<> ();

        Margaritta marg1 = new Margaritta ("thin");
        Margaritta marg2 = new Margaritta ("regular");

        QuattroFormaggi qf1 = new QuattroFormaggi ("thin");
        QuattroFormaggi qf2 = new QuattroFormaggi ("regular");


        pizzaList.addPizza (marg1);
        pizzaList.addPizza (marg2);
        pizzaList.addPizza (qf1);
        pizzaList.addPizza (qf2);

        pizzaList.removePizza (marg1);
        pizzaList.printList ();
    }
}
