package assignmentSRP;

/**
 * Created by jagtapm on 7/25/2017.
 */
class AccountService {
     static void updateSalary(EmployeeService employee, double newSalary) {
        employee.setSalary(newSalary);
         System.out.println("updated salary is: " + employee.getSalary());
    }

     static double calculateTDS(EmployeeService employee) {
        return (employee.getSalary() * 0.18);

    }

}
