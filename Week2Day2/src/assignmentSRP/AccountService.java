package assignmentSRP;

/**
 * Created by jagtapm on 7/25/2017.
 */
class AccountService {
     static void updateSalary(EmployeeService employee, double newSalary) {
        employee.setSalary(newSalary);
         System.out.println("updated salary is: " + employee.getSalary());
    }

    static void updateSalaryByPercentage(EmployeeService employee) {
         if (employee.getSalary() < 20000.00) {
             employee.setSalary(employee.getSalary() * 1.2);
         }

        System.out.println("updated salary is: " + employee.getSalary());
    }

     static double calculateTDS(EmployeeService employee) {
        return (employee.getSalary() * 0.38);

    }

}
