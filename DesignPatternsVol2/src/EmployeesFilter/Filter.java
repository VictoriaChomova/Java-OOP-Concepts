package EmployeesFilter;

import java.util.ArrayList;
import java.util.List;

public interface Filter {

    public List<Employee2> applyFilter(List<Employee2> employees);
}
