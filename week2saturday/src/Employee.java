/**
 * Created by jagtapm on 7/22/2017.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String departmentName;
    private int employeeId;
    private Location location;

    public Employee(String firstName, String lastName, String departmentName, int employeeId, Location location) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentName = departmentName;
        this.employeeId = employeeId;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", employeeId=" + employeeId +
                ", location=" + location +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
