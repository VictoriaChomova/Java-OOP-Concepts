package MVCEx;

public class UserController {
    public User user;
    public UserView view;


    public UserController(User user, UserView view) {
        this.user = user;
        this.view = view;
    }

    void updateUserInfo(String name, int age, String email, String address) {
        user.updateInfo (name, age, email, address);
    }

    void printUserInfo() {
        view.printUserInfo (user.getName (), user.getAge (), user.getEmail (), user.getAddress ());
    }
}
