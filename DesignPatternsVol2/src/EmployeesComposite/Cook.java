package EmployeesComposite;

public class Cook implements Employee{
    public String name;
    public String position;


    public Cook(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println ("Name: " + this.name + "\nPosition: " + this.position);
    }
}
