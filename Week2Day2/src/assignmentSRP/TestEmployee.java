package assignmentSRP;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by jagtapm on 7/25/2017.
 */
public class TestEmployee {

    public List<EmployeeService> createData() {

     List<EmployeeService> employeeServices =new ArrayList<EmployeeService>();

     EmployeeService[] employeeServices1 = {new EmployeeService(101, "Mahesh", 6060606.00, "764564574", "g2l1", "automobile"), new EmployeeService(102, "Mahesh", 6060606.00, "764564574", "g2l1", "automobile"),
             new EmployeeService(103, "Mahesh", 6060606.00, "764564574", "g2l1", "automobile"),
             new EmployeeService(104, "Mahesh", 60606.00, "764564574", "g2l1", "automobile"),
             new EmployeeService(105, "Mahesh", 606006.00, "764564574", "g2l1", "automobile"),
             new EmployeeService(106, "Mahesh", 60606.00, "764564574", "g2l1", "automobile"),
             new EmployeeService(107, "Mahesh", 60606.00, "764564574", "g2l1", "automobile"),
             new EmployeeService(108, "Mahesh", 60606.00, "764564574", "g2l1", "automobile"),
             new EmployeeService(109, "Mahesh", 60606.00, "764564574", "g2l1", "automobile"),
             new EmployeeService(110, "Mahesh", 666.00, "764564574", "g2l1", "automobile")};

     employeeServices = Arrays.asList(employeeServices1);
     return employeeServices;
    }
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

        System.out.println("TDS for all employees : ");
        List<EmployeeService> employeeServices =createData();
        Iterator<EmployeeService> iterator = employeeServices.iterator();
        EmployeeService employeeService = new EmployeeService();
        while(iterator.hasNext()) {
            employeeService = iterator.next();
            System.out.println(employeeService.getSalary());
            System.out.println( "TDS " + AccountService.calculateTDS(employeeService));
            AccountService.updateSalaryByPercentage(employeeService);
        }

    }
}
