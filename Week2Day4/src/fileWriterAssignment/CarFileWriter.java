package fileWriterAssignment;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by jagtapm on 7/27/2017.
 */
public class CarFileWriter {
    public static void main(String[] args) {
        Set<String> carSet = new HashSet<>();
        carSet.add("maruti");
        carSet.add("bmw");
        carSet.add("skoda");
        carSet.add("auto");
        carSet.add("maa");
        carSet.add("maru");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("C:/Users/jagtapm/Documents/MJagtap/Week2Day4/src/fileWriterAssignment/car.txt");
//            fileWriter.write(carSet.toString());
            Iterator<String> itr = carSet.iterator();
            while (itr.hasNext()) {
                fileWriter.write(itr.next());
                fileWriter.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileWriter != null)
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
