package assignmentSRP;

/**
 * Created by jagtapm on 7/25/2017.
 */
class EmployeeService {
    private int empId;
    private String name;
    private double salary;
    private String phone;
    private String desig;
    private String project;

    public EmployeeService() {

    }



    public EmployeeService(int empId, String name, double salary, String phone, String desig, String project) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.phone = phone;
        this.desig = desig;
        this.project = project;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }
}
