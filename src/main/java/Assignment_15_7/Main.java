package Assignment_15_7;

import Assignment_15_7.company.Company;
import Assignment_15_7.company.CompanyService;
import Assignment_15_7.employee.Employee;
import Assignment_15_7.employee.EmployeeService;

/**
 * Created by jagtapm on 7/16/2017.
 */
public class Main {
    public static void main(String[] args) {
        Company c = new Company("CDK", 5000, City.PUNE);
        CompanyService companyService = new CompanyService();
        Employee employee = companyService.addEmployee("44", "Mahesh", Month.JULY, Year.C, 10, 67676, 4);
        System.out.println("===================");
        companyService.assignGrade(employee, 5);
        System.out.println("===================");
        companyService.updateAttendance(employee);
        System.out.println("===================");
        companyService.payroll(employee, 50000.00);
        System.out.println("===================");
        companyService.display(c);
        System.out.println("===================");
        EmployeeService employeeService = new EmployeeService();
        employeeService.display(employee);
        System.out.println("===================");
        employeeService.editName(employee, "Mahesh Jagtap");
        System.out.println("===================");
        employeeService.display(employee);
        System.out.println("===================");
        employeeService.askQuery(employee, "Query Sample 1");


    }


}
