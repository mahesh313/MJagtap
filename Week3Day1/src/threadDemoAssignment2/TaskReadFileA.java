package threadDemoAssignment2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by jagtapm on 7/31/2017.
 */
public class TaskReadFileA implements Runnable {
    @Override
    public void run() {
        InputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\jagtapm\\Documents\\MJagtap\\Week3Day1\\src\\threadDemoAssignment2\\file1.txt");
            int b = fis.read();
            System.out.print((char) b);
            while(b != -1) {
                b = fis.read();
                System.out.print((char) b);
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null)
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
