package assignmentSRP;

import org.junit.Test;

/**
 * Created by jagtapm on 7/25/2017.
 */
public class TestEmployee {

    @Test
    public void testEmployee() {
        EmployeeService employee1 = new EmployeeService(101, "Mahesh", 6060606.00, "764564574", "g2l1", "automobile");
        System.out.println(AccountService.calculateTDS(employee1));
        AccountService.updateSalary(employee1, 85768578675.09);
        ManagerService.changeProject(employee1, "Car");
        if (ManagerService.eligibleForPromotion(employee1, "g2l2" )) {
            System.out.println("Employee " + employee1.getName() + " is eligible for promotion ");
        } else {
            System.out.println("Employee " + employee1.getName() + " is not eligible for promotion ");
        }
        HRService.changeDesignation(employee1, "Senior Member Technical");

    }
}
