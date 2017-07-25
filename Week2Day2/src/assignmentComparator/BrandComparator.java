package assignmentComparator;

import java.util.*;

/**
 * Created by jagtapm on 7/25/2017.
 */
public class BrandComparator implements Comparator<Car>{
    @Override
    public int compare(Car c1, Car c2) {
        return c1.getBrand().compareToIgnoreCase(c2.getBrand());
    }
}
