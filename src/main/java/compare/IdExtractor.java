package compare;

import employee.Employee;

import java.util.Comparator;

/**
 * Created by jagtapm on 7/20/2017.
 */
class IdExtractor implements Extractor {

//    public long extractInt(Employee employee) {
//
//        return employee.getDeptId();
//    }


    @Override
    public long extractInt(Employee employee) {
        return employee.getEmployeeId();
    }
}
