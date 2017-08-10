package Assignment_14_7;

/**
 * Created by jagtapm on 7/14/2017.
 */
public class Mechanic {
    public static void main(String[] args) {
        Car car = new Car(575, "Honda", 100);
        car.details();
        car.inspect();
        car.drive();
        System.out.println("==============");
        Bike bike = new Bike(757, "yamaha", 150);
        bike.details();
        bike.inspect();
        bike.drive();

    }
}
