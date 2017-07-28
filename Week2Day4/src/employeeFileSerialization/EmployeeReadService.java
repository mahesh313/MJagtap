package employeeFileSerialization;

import org.junit.Test;

import java.io.*;

/**
 * Created by jagtapm on 7/27/2017.
 */
public class EmployeeReadService {
    @Test
    public void readEmployeeData() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("C:/Users/jagtapm/Documents/MJagtap/Week2Day4/src/employeeFileSerialization/EmployeeDetails.txt");
            ois = new ObjectInputStream(fis);
            Object o1;
            while ((o1 = ois.readObject()) != null) {
                Employee employee = (Employee) o1;
//                System.out.println(employee.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (EOFException e){
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
