package Ex3;

import java.util.ArrayList;
import java.util.List;

public class PizzaArrayList <P extends Pizza> {

    List<P> pizzaList;


    public PizzaArrayList() {
        this.pizzaList = new ArrayList<> ();
    }

    public void addPizza(P pizza) {
        this.pizzaList.add (pizza);
        System.out.println ("Pizza " + pizza.getName () + " is added to the list.");
    }

    public void removePizza(P pizza) {
        this.pizzaList.remove (pizza);
        System.out.println ("Pizza " + pizza.getName () + " is removed from the list.");
    }

    public void printList() {
        for (P pizza: this.pizzaList) {
            System.out.println (pizza.getName () + ": \n" + pizza.dough + "\n" + pizza.sauce + "\n" + pizza.crust + "\n");
        }
    }

}
