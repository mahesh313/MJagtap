package compare;

import employee.Employee;

/**
 * Created by jagtapm on 7/19/2017.
 */
public class CompareName implements Compare{

    @Override
    public int compare(Object o1, Object o2) {
        Employee employee1 = (Employee)o1;
        Employee employee2 = (Employee)o2;
        int i =  employee1.getName().compareToIgnoreCase(employee2.getName()) ;
        if(i < 0) {
            return -1;
        } else if(i > 0) {
            return  1;
        }
        return 0;

    }
}
