package Assignment_15_7.employee;

import Assignment_15_7.Year;

/**
 * Created by jagtapm on 7/16/2017.
 */
public class EmployeeService {

    public void editName(Employee employee, String name) {
        employee.name = name;
        System.out.println("employee name upadted to " + employee.name);
    }

    public void askQuery(Employee employee, String query) {
        System.out.println("Qurey recorded for " + employee.name);
    }

    public void display(Employee employee){
        System.out.println("Employee id " + employee.id);
        System.out.println("Employee name " + employee.name);
        System.out.println("Employee joining month " + employee.joiningMonth);
        System.out.println("Employee joining year " + employee.joiningYear.year);
        System.out.println("Employee attendance " + employee.attendance);
        System.out.println("Employee accountbalace " + employee.accountBalance);
        System.out.println("Employee grade " + employee.grade);
    }
}
