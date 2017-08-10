
package compare;

import employee.Employee;

import java.util.Comparator;

/**
 * Created by jagtapm on 7/20/2017.
 */
class IntComapartor implements Comparator<Employee> {

    //    public long extractInt(Employee employee) {
//
//        return employee.getDeptId();
//    }
    private Extractor extractor;

    public IntComapartor(Extractor extractor) {
        this.extractor = extractor;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (extractor.extractInt(o1) - extractor.extractInt(o2));
    }
}

