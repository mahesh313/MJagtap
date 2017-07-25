package assignmentComparator;

import org.junit.Test;

import java.util.*;

/**
 * Created by jagtapm on 7/25/2017.
 */
public class CarTest {

    public Set<Car> createData() {
        Set<Car> carSet = new TreeSet<Car>();
        Car[] cars = createArray();
        for (Car car : cars ) {
            carSet.add(car);
        }
        return carSet;

    }


    public Set<Car> createData(Comparator<Car> comparator) {
        Set<Car> carSet = new TreeSet<Car>(comparator);
        Car[] cars = createArray();
        for (Car car : cars ) {
            carSet.add(car);
        }
        return carSet;

    }
    public Car[] createArray() {
        Car[] cars = {new Car(10, 6566.6, "Maruti"),
                new Car(11, 65656.6, "Suzuki"),
                new Car(12, 65556.6, "Hyundau"),
                new Car(13, 9865656.6, "Volvo"),
                new Car(14, 465656.6, "BMW"),
                new Car(15, 34365656.6, "Ford"),
                new Car(16, 35656.6, "Vols"),
                new Car(17, 1565656.6, "Mercedes"),
                new Car(18, 9565656.6, "Ferrari"),
                new Car(19, 665656.6, "Lambo"),
                new Car(20, 7676656.6, "Ma"),
                new Car(21, 56.6, "abc"),
                new Car(22, 65667656.6, "bkc"),
                new Car(23, 68989.6, "Tata"),
                new Car(24, 8078.6, "Buggati"),
                new Car(25, 65656.6, "Batmobile"),
                new Car(26, 6565.6, "er"),
                new Car(27, 65656.6, "eree"),
                new Car(28, 6565.6, "Mar"),
                new Car(29, 656232, "M"),
                new Car(30, 6533, "Mare"),
                new Car(31, 6343, "Mere"),
                new Car(32, 6565343, "uuu"),
                new Car(33, 653434, "uut"),
                new Car(34, 6565353, "zzz")};
        return cars;

    }

    @Test
    public void carTest() {
        System.out.println("=================sorting by CarPrice========================");
        Set<Car> carSet = createData();
        Iterator<Car> iterator = carSet.iterator();
        Car car = new Car();
        while (iterator.hasNext()) {
            car = iterator.next();
            System.out.println("Car id: " + car.getId() + " Price: " + car.getPrice() + " brand: " + car.getBrand());
        }

        System.out.println("=================sorting by CarId========================");
        carSet = createData(new IdComparator());
        iterator = carSet.iterator();
        while (iterator.hasNext()) {
            car = iterator.next();
            System.out.println("Car id: " + car.getId() + " Price: " + car.getPrice() + " brand: " + car.getBrand());
        }

        System.out.println("=================sorting by CarBrand========================");
        carSet = createData(new BrandComparator());
        iterator = carSet.iterator();
        while (iterator.hasNext()) {
            car = iterator.next();
            System.out.println("Car id: " + car.getId() + " Price: " + car.getPrice() + " brand: " + car.getBrand());
        }

    }

}
