package employeeFile;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

/**
 * Created by jagtapm on 7/27/2017.
 */
public class EmployeeWriteService {
    public List<Employee> createData() {
        Employee[] employees = {new Employee(11, "Mahesh", 644322, "Member Technical", 21),
                new Employee(1, "Jagtap", 6443, "Member Technical", 21),
                new Employee(144, "Sameer", 32200, "Member Technical", 21),
                new Employee(12, "Raju", 40000, "Member Technical", 21),
                new Employee(51, "Pandu", 40001, "Member Technical", 21),
                new Employee(1090, "Ganesh", 777322, "Member Technical", 21),
                new Employee(113, "Ramu", 999322, "Member Technical", 21)};
        return Arrays.asList(employees);

    }

    @Test
    public void writeEmployeeData() {
        List<Employee> employeeList = createData();
        List<Employee> finalList = new ArrayList<>();
        Iterator<Employee> employeeIterator = employeeList.iterator();
        while (employeeIterator.hasNext()) {
            Employee employee = employeeIterator.next();
            if (employee.getSalary() > 40000) {
                finalList.add(employee);
            }
        }
        Collections.sort(finalList);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("C:/Users/jagtapm/Documents/MJagtap/Week2Day4/src/employeeFile/EmployeeDetails.txt");
            oos = new ObjectOutputStream(fos);
            Iterator<Employee> employeeIterator1 = finalList.iterator();
            while (employeeIterator1.hasNext()) {
                oos.writeObject(employeeIterator1.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }





}
