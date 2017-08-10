package compare;

import employee.Employee;

/**
 * Created by jagtapm on 7/19/2017.
 */
public class CompareId implements Compare {
    @Override
    public int compare(Object o1, Object o2) {
        Employee employee1 = (Employee)o1;
        Employee employee2 = (Employee)o2;
        if (employee1.getEmployeeId() == employee2.getEmployeeId())
            return 0;
        return (employee1.getEmployeeId() > employee2.getEmployeeId()) ? 1 : -1;
    }
}
