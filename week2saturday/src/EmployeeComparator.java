import java.util.Comparator;

/**
 * Created by jagtapm on 7/22/2017.
 */
public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int i = o1.getLocation().compareTo(o2.getLocation());
        if(i != 0) {
            return i;
        }
        i = o1.getDepartmentName().compareToIgnoreCase(o2.getDepartmentName());
        if(i != 0) {
            return i;
        }
        i = o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
        if(i != 0) {
            return i;
        }
        i = o1.getLastName().compareToIgnoreCase(o2.getLastName());
        if(i != 0) {
            return i;
        }
        i = o1.getEmployeeId() - o2.getEmployeeId();
        return i;




    }
}
