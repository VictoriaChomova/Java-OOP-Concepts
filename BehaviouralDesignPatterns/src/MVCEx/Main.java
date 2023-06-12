package MVCEx;

public class Main {
    public static void main(String[] args) {
        //fetch student record based on his roll no from the database
        User user = new User ("Victoria", 28, "viktoria@gmail.com", "Plovdiv, Bulgaria");
        User user2 = new User ("Boris", 28, "boris@gmail.com", "Hristo Botev 40");

        //Create a view : to write student details on console

        UserView view = new UserView ();
        UserController controller1 = new UserController (user, view);
        UserController controller2 = new UserController (user2, view);

        controller1.printUserInfo ();
        controller2.printUserInfo ();

        controller1.updateUserInfo ("Viktoria", 27, "viktoria@gmail.com", "Hristo Botev 30");
        controller1.updateUserInfo ("Boris", 28, "boris123@gmail.com", "Hristo Botev 40");

        //update model data
        controller1.printUserInfo ();
        controller2.printUserInfo ();

    }
}
