package assignmentSRP;

/**
 * Created by jagtapm on 7/25/2017.
 */
public class HRService {
    static void changeDesignation(EmployeeService employee, String newDesig) {
        employee.setDesig(newDesig);
        System.out.println("updated designation is: " + employee.getDesig());
    }
}
