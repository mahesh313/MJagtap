package Assignment_15_7.company;

import Assignment_15_7.Month;
import Assignment_15_7.Year;
import Assignment_15_7.employee.Employee;

/**
 * Created by jagtapm on 7/16/2017.
 */
public class CompanyService {

    public void updateAttendance(Employee employee) {
        employee.attendance += 1;
        System.out.println("Employee attendance updated to " + employee.attendance);
    }

    public void payroll(Employee employee, double payment) {
        employee.accountBalance += payment;
        System.out.println("Employee balance updated to " + employee.accountBalance);
    }

    public void assignGrade(Employee employee, int grade) {
        employee.grade = grade;
        System.out.println("Employee grade updated to " + employee.grade);
    }

    public Employee addEmployee(String id, String name, Month joiningMonth, Year joiningYear, int attendance, double accountBalance, int grade) {
        Employee employee = new Employee(id, name, joiningMonth, joiningYear, attendance, accountBalance, grade);
        System.out.println("new employee added");
        return employee;
    }

    public void display(Company company) {
        System.out.println("name " + company.name);
        System.out.println("strength " + company.strength);
        System.out.println("city " + company.city);

    }







}
