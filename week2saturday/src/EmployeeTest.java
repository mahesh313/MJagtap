import org.junit.Test;

import java.util.*;

/**
 * Created by jagtapm on 7/22/2017.
 */
public class EmployeeTest {
    public List<Employee> createData() {
        List<Employee> employees = new ArrayList<Employee>();
        Employee employee = new Employee("Mahesh","Jagtap", "RnD", 545, Location.PUNE );
        Employee employee1 = new Employee("Mukesh","Jagtap1", "RnD", 546, Location.PUNE );
        Employee employee2 = new Employee("Rajesh","Jagtap2", "RnD", 547, Location.PUNE );
        Employee employee3 = new Employee("Mahesh","Jadhav", "RnD", 548, Location.PUNE );
        Employee employee4 = new Employee("Suresh","Karode", "RnD", 549, Location.PUNE );
        Employee employee5 = new Employee("Ramesh","Singh", "RnD", 550, Location.PUNE );
        Employee employee6 = new Employee("Mangesh","Raa", "RnD", 551, Location.PUNE );
        Employee employee7 = new Employee("rajesh","chavan", "RnD", 552, Location.PUNE );
        Employee employee8 = new Employee("rajesh","chavan", "Finanace", 553, Location.PUNE );
        Employee employee9 = new Employee("Sneh","gaikwad", "HR", 554, Location.PUNE );
        Employee employee10 = new Employee("Sopori","mate", "HR", 555, Location.PUNE );
        Employee employee11 = new Employee("Krunal","kasar", "Finance", 558, Location.PUNE );
        Employee employee20 = new Employee("Omkar","Jagtap", "RnD", 645, Location.PUNE );
        Employee employee21 = new Employee("Mukesh","ambani", "RnD", 646, Location.PUNE );
        Employee employee22 = new Employee("Sanket","lokandhwala", "RnD", 647, Location.PUNE );
        Employee employee23 = new Employee("raj","bhanarwala", "RnD", 648, Location.PUNE );
        Employee employee24 = new Employee("seema","dayani", "RnD", 649, Location.PUNE );
        Employee employee25 = new Employee("geeta","motwani", "RnD", 650, Location.PUNE );
        Employee employee26 = new Employee("seeta","kalyani", "RnD", 651, Location.PUNE );
        Employee employee27 = new Employee("babita","mawani", "RnD", 652, Location.PUNE );
        Employee employee28 = new Employee("shewta","hariyani", "Finanace", 653, Location.PUNE );
        Employee employee29 = new Employee("nita","kadam", "HR", 654, Location.PUNE );
        Employee employee30 = new Employee("sangita","ghodekar", "HR", 655, Location.PUNE );
        Employee employee31 = new Employee("Sarita","kar", "Finance", 758, Location.HYDARABAD );
        Employee employee32 = new Employee("Sarita","kar", "Finance", 858, Location.HYDARABAD );
        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);
        employees.add(employee9);
        employees.add(employee10);
        employees.add(employee11);
        employees.add(employee20);
        employees.add(employee21);
        employees.add(employee22);
        employees.add(employee23);
        employees.add(employee24);
        employees.add(employee25);
        employees.add(employee26);
        employees.add(employee27);
        employees.add(employee28);
        employees.add(employee29);
        employees.add(employee30);
        employees.add(employee31);
        employees.add(employee32);
//        Employee[] employees1 = {new Employee("Mahesh","Jagtap", "RnD", 545, Location.PUNE),};
//        List<Employee> employees2 = Arrays.asList(employee1);

        return employees;

    }
    @Test
    public void employeeTest(){
        List<Employee> employees = createData();
        Comparator<Employee> compareEmployee = new EmployeeComparator();
        Collections.sort(employees,compareEmployee);
        for(Employee e : employees) {
            System.out.println(e.toString());
        }



    }
}
