package streamDemo;

import com.sun.org.glassfish.external.statistics.Statistic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by jagtapm on 7/29/2017.
 */
public class EmployeeStream {
    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(new Employee(11, 500), new Employee(12, 600),
                new Employee(13, 60000),new Employee(14, 54400),new Employee(15, 64500),
                new Employee(16, 60000),new Employee(17, 65400),new Employee(18, 4600),
                new Employee(19, 70000),new Employee(20, 604540),new Employee(21, 45600),
                new Employee(22, 80000),new Employee(23, 4500),new Employee(24, 66600),
                new Employee(25, 90000),new Employee(26, 600),new Employee(27, 34600),
                new Employee(28, 100000),new Employee(29, 600),new Employee(30, 242600),
                new Employee(31, 11000),new Employee(32, 604540),new Employee(33, 34600),
                new Employee(34, 120000),new Employee(35, 555),new Employee(36, 34600),
                new Employee(37, 1200),new Employee(38, 645400),new Employee(39, 344600),
                new Employee(40, 600),new Employee(41, 6045450),new Employee(42, 4600),
                new Employee(43, 600),new Employee(44, 6045450),new Employee(45, 34600),
                new Employee(46, 500),new Employee(47, 60540),new Employee(48, 63400),
                new Employee(49, 100),new Employee(50, 60450),new Employee(51, 600),
                new Employee(52, 60770),new Employee(53, 6050),new Employee(54, 400),
                new Employee(55, 606),new Employee(56, 60450),new Employee(57, 43400),
                new Employee(58, 60767),new Employee(59, 60450),new Employee(60, 63400),
                new Employee(61, 60034),new Employee(62, 600),new Employee(63, 634300),
                new Employee(64, 6003),new Employee(65, 600),new Employee(66, 63400));
        //TDS
        System.out.println("TDS");
        System.out.println(employees.stream()
                            .filter(Employee -> Employee.getSalary() > 50000.00)
                            .map(Employee -> Employee.getSalary() * 0.1)
                             .reduce((a,b) -> a + b)
                            .get());

        //Average of all employee salaries per month
//        System.out.println((employees.stream()
//                            .map(Employee -> Employee.getSalary())
//                            .reduce((a,b) -> a+b).get()) / employees.size());
        //use .count() instead
        System.out.println("Average of salaries");
        System.out.println((employees.stream()
                .map(Employee -> Employee.getSalary())
                .reduce((a,b) -> a+b).get()) / employees.stream()
                .map(Employee -> 1)
                .reduce((a, b) -> a + b).get() );

        System.out.println("Total salary");
        //Total salary paid to all per month
        System.out.println(employees.stream()
                .map(Employee -> Employee.getSalary())
                .reduce((a,b) -> a+b).get());

        System.out.println("Maximum salary");
       //Maximum Salary
        System.out.println(employees.stream()
                .map(Employee -> Employee.getSalary())
                .max((o1, o2) -> (int)(o1 - o2)).get());

        System.out.println("Minimum salary");
        //Minimum
        System.out.println(employees.stream()
                .map(Employee -> Employee.getSalary())
                .min((o1, o2) -> (int)(o1 - o2)).get());

        System.out.println("Number of employees");
        //employee number
        System.out.println(employees.stream()
                    .map(Employee -> 1)
                    .reduce((a, b) -> a + b).get());










    }
}

