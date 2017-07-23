package employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by jagtapm on 7/18/2017.
 */
public class Employee {
    private long employeeId;
    private String name;
    private String lastName;
    private Date dateOfBirth;
    private Date dateOfJoining;
    private long deptId;
    private Location location;
    public Employee() {}

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Employee(long employeeId, String name, String lastName, Date dateOfBirth, Date dateOfJoining, long deptId, Location location) {
        this.employeeId = employeeId;
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfJoining = dateOfJoining;
        this.deptId = deptId;
        this.location = location;

    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public long getDeptId() {
        return deptId;
    }

    public void setDeptId(long deptId) {
        this.deptId = deptId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{ name=" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth + " }";
    }
}

class EmployeeTest {

    public static List<Employee> createTestData() throws ParseException {

        List<Employee> employees = new ArrayList<Employee>();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMMM-dd");
        Date yourDate = sdf.parse("1992-June-26");
        Employee employee = new Employee(7847847, "Mahesh", "Jagtap",yourDate, new Date(System.currentTimeMillis()), 5, Location.PUNE );
        employees.add(employee);

        yourDate = sdf.parse("1997-June-26");
        Employee employee2 = new Employee(784747, "Sameer", "Karode",yourDate, new Date(System.currentTimeMillis()), 4, Location.HYDARABAD );
        employees.add(employee2);

        yourDate = sdf.parse("1999-June-29");
        Employee employee3 = new Employee(78447, "Jagtap", "surname",yourDate, new Date(System.currentTimeMillis()), 7, Location.PUNE );
        employees.add(employee3);



        return employees;

    }
    public static void main(String[] args) throws ParseException {
        EmployeeTest employeeTest = new EmployeeTest();
        List<Employee> employeeList = employeeTest.createTestData();
        for (Employee object : employeeList ) {
            System.out.println(object.toString());
//            System.out.println("Employee Name " + object.getName() + " Employee ID " + object.getEmployeeId() + " BirthDate " + object.getDateOfBirth() + " DateOfJoining " + object.getDateOfJoining() + " Dept Id " + object.getDeptId() + " location " + object.getLocation());

        }

    }
}
