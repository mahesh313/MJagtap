package compare;

import employee.Employee;

/**
 * Created by jagtapm on 7/20/2017.
 */
public class DeptExtractor implements Extractor {
    @Override
    public long extractInt(Employee employee) {
        return employee.getDeptId();
    }
}
