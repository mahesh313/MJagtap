package compare;

import employee.Employee;
import employee.Location;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by jagtapm on 7/20/2017.
 */
public class EmployeeTest {
    List<Employee> createTestData() throws ParseException{
        List<Employee> employees = new ArrayList<Employee>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMMM-dd");
        Date yourDate = sdf.parse("1992-June-26");
        Employee employee = new Employee(784, "Mahesh", "Jagtap",yourDate, new Date(System.currentTimeMillis()), 5, Location.PUNE );
        yourDate = sdf.parse("1994-June-28");
        Employee employee2 = new Employee(77, "Sameer", "Karode",yourDate, new Date(System.currentTimeMillis()), 4, Location.HYDARABAD );
        yourDate = sdf.parse("1999-June-29");
        Employee employee3 = new Employee(89, "Jagtap", "Surname",yourDate, new Date(System.currentTimeMillis()), 7, Location.PUNE );
        employees.add(employee3);
        employees.add(employee2);
        employees.add(employee);
        return employees;
    }
    @Test
    public void testEmployeeId() throws ParseException{
//        Comparator<Employee> comapareIds = new MyUtil.IdComparator();
        Comparator<Employee> compareInts = new IntComapartor(new IdExtractor());
        List<Employee> employees = createTestData();
        Collections.sort(employees,compareInts);
        for(Employee e : employees) {
            System.out.println(e.toString());
        }

    }
    @Test
    public void testDeptId() throws ParseException{
        Comparator<Employee> compareInts = new IntComapartor(new DeptExtractor());
        List<Employee> employees = createTestData();
        Collections.sort(employees,compareInts);
        for(Employee e : employees) {
            System.out.println(e.toString());
        }

    }
}
