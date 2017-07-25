package assignmentComparator;

import java.util.Comparator;

/**
 * Created by jagtapm on 7/25/2017.
 */
public class IdComparator implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        if (c1.getId() == c2.getId())
            return 0;
        else if (c1.getId() > c2.getId())
            return 1;
        else
            return -1;
    }
}
