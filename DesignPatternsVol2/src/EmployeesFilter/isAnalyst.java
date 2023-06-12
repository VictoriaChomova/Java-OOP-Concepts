package EmployeesFilter;

import EmployeesComposite.Employee;

import java.util.ArrayList;
import java.util.List;

public class isAnalyst implements Filter {

    @Override
    public List<Employee2> applyFilter(List<Employee2> employees) {
        List<Employee2> filteredList = new ArrayList<> ();

        for (Employee2 employee : employees) {
            if (employee.getJob ().equalsIgnoreCase ("Analyst")) {
                filteredList.add (employee);
            }
        }
        return filteredList;
    }

}
