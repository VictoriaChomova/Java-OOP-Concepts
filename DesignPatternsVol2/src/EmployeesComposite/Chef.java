package EmployeesComposite;

import java.util.ArrayList;
import java.util.List;

public class Chef {
    String name;
    String position;
    List<Employee> employeeList = new ArrayList<Employee> ();



    public Chef(String name,String position) {
        this.name = name;
        this.position = position;

    }

    public void addEmployee (Employee employee) {
        employeeList.add (employee);
    }

    public void removeEmployee (Employee employee) {
        employeeList.remove (employee);
    }

    public void showEmployeeDetails() {
        System.out.println("Chef: " + name + ", Position: " + position);
        System.out.println("Here is a list of subordinates");

        for (Employee employee : employeeList) {

            employee.showEmployeeDetails();
        }
    }
}
