package Assignment_14_7;

/**
 * Created by jagtapm on 7/14/2017.
 */
public class Car extends Vehicle{
    public Car() {
    }

    public Car(int vin, String name, int speed) {
        super(vin, name, speed);
    }

    void drive() {
        System.out.println("driving car ");
    }

    void inspect() {
        System.out.println("inspecting car");
    }

}
