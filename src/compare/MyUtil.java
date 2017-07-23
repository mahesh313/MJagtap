package compare;

import employee.Employee;
import employee.Location;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by jagtapm on 7/19/2017.
 */
public class MyUtil {
//    public static int[] sort(int[] input) {
//        int temp;
//        int flag = 1;
//        for(int i = 0; i < input.length && flag == 1; i++) {
//            flag = 0;
//            for(int j = 0; j < input.length - i; j++ ) {
//                if(input[j] > input[j + 1]) {
//                    temp = input[j];
//                    input[j] = input[j + 1];
//                    input[j + 1] = temp;
//                    flag = 1;
//                }
//            }
//        }
//        return input;
//    }
//    public void sort() {
//        Comparator<Employee> comapareIds = new IdComparator();
//
//
//    }

    public static class IdComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return (int) (o1.getEmployeeId()-o2.getEmployeeId());
        }
    }
    public static class DeptIdComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return (int) (o1.getDeptId()-o2.getDeptId());
        }
    }

    public static List sort(List objects, Compare comp) {
        long temp;
        int flag = 1;
        for(int i = 0; i < objects.size() && flag == 1; i++) {
            flag = 0;
            for(int j = 0; j < objects.size() - i - 1; j++ ) {
                //employees.get(j).getEmployeeId() > employees.get(j + 1).getEmployeeId()
                //sort.compare(employees.get(j), employees.get(j + 1)) == 1
                if(comp.compare(objects.get(j), objects.get(j + 1)) == 1) {
                    Object e = objects.get(j);
                    objects.set(j, objects.get(j + 1));
                    objects.set(j + 1, e);
                    flag = 1;
                }
            }
        }
        return objects;
    }

    public static void main(String[] args) throws ParseException {
//        int[] input = {9, 14, 7, 8, 23, -1, 0};
//        sort(input);
//        List<Employee> employees = new ArrayList<Employee>();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMMM-dd");
//        Date yourDate = sdf.parse("1992-June-26");
//        Employee employee = new Employee(784, "Mahesh", yourDate, new Date(System.currentTimeMillis()), 5, Location.PUNE );
//        yourDate = sdf.parse("1994-June-28");
//        Employee employee2 = new Employee(77, "Sameer", yourDate, new Date(System.currentTimeMillis()), 4, Location.HYDARABAD );
//        yourDate = sdf.parse("1999-June-29");
//        Employee employee3 = new Employee(89, "Jagtap", yourDate, new Date(System.currentTimeMillis()), 7, Location.PUNE );
//        employees.add(employee3);
//        employees.add(employee2);
//        employees.add(employee);
////        sort(employees, new CompareId());
////
//////        sort(employees);
////        for(Employee e : employees) {
////            System.out.println(e.toString());
////        }
////        System.out.println("=======================");
////        sort(employees, new CompareDeptId());
////        for(Employee e : employees) {
////            System.out.println(e.toString());
////        }
////        System.out.println("=========================");
////        sort(employees, new CompareName());
//        for(Employee e : employees) {
//            System.out.println(e.toString());
//        }
//        Comparator<Employee> comapareIds = new IdComparator();
//        Collections.sort(employees,comapareIds);
//        for(Employee e : employees) {
//            System.out.println(e.toString());
//        }
//        Comparator<Employee> comapareDeptIds = new DeptIdComparator();
//        Collections.sort(employees,comapareDeptIds);
//        for(Employee e : employees) {
//            System.out.println(e.toString());
//        }
//


//
    }


}

