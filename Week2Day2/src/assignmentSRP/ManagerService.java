package assignmentSRP;

/**
 * Created by jagtapm on 7/25/2017.
 */
class ManagerService {
    static boolean eligibleForPromotion(EmployeeService employee, String newDesig) {
        if (employee.getDesig().compareToIgnoreCase(newDesig) < 0) {
            return true;
        }
        return false;

    }


    static void changeProject(EmployeeService employee, String newProject) {
        employee.setProject(newProject);
        System.out.println("new project is: " + employee.getProject());

    }

}
