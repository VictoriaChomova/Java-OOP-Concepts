package Ex4;

public class Manager extends Worker{
    public Manager(String firstName, String lastName, int salary, int experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.experience = experience;
        this.position = "manager";
    }
}
