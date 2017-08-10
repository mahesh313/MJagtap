package Assignment_14_7;

/**
 * Created by jagtapm on 7/14/2017.
 */
abstract public class Vehicle {
    protected int vin;
    protected String name;
    protected int speed;

    public Vehicle() {}

    public Vehicle(int vin, String name, int speed) {
        this.vin = vin;
        this.name = name;
        this.speed = speed;
    }


    abstract void drive();

    abstract void inspect();

    void details() {
        System.out.println("vin : " + this.vin);
        System.out.println("name : " + this.name);
        System.out.println("speed : " + this.speed);
    }
}
