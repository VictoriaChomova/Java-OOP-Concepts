package Ex4;

public class Developer extends Worker {

    public Developer(String firstName, String lastName, int salary, int experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.experience = experience;
        this.position = "developer";
    }
}
