package Assignment_14_7;

/**
 * Created by jagtapm on 7/14/2017.
 */
public class Bike extends Vehicle {


    public Bike() {
    }

    public Bike(int vin, String name, int speed) {
        super(vin, name, speed);
    }

    void drive() {
        System.out.println("driving bike ");
    }

    void inspect() {
        System.out.println("inspecting bike");
    }
}
