package ioAssignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by jagtapm on 7/27/2017.
 */
public class MovieReader {
    public static void main(String[] args) {
        InputStream fis = null;
        try {
            fis = new FileInputStream("C:/Users/jagtapm/Documents/MJagtap/Week2Day4/src/ioAssignment/Movie.txt");
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
