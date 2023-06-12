package BurgasPizzaStore;


public class Main {
    public static void main(String[] args) {

        PizzaStore plovdivPizzaStore = SelectPizzaStore.getStore ("Plovdiv");
        PizzaStore burgasPizzaStore = SelectPizzaStore.getStore ("Burgas");

        Pizza pizza1 = plovdivPizzaStore.createPizza ("Margaritta");
        Pizza pizza2 = burgasPizzaStore.createPizza ("Barbeque");

        plovdivPizzaStore.orderPizza (pizza1);

        burgasPizzaStore.orderPizza (pizza2);

        pizza1.bake ();
        pizza1.cut ();
        pizza1.box ();




//        BurgasPizzaStore pizzaStore = new BurgasPizzaStore ();
//        Pizza pizza1 = pizzaStore.createPizza ("Margaritta");
//        Pizza pizza2 = pizzaStore.createPizza ("Barbeque");
//
//        pizzaStore.orderPizza (pizza1);
    }
}
