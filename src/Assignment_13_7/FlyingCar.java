package Assignment_13_7;

/**
 * Created by jagtapm on 7/13/2017.
 */
public class FlyingCar extends Car {
    String flyingStyle;
    int wingSpan;

    public FlyingCar() {
    }

    public FlyingCar(String model, String manufacturer, int length, int width, int hight, int wheelBase, int weight, double price, int torque, int power, int speed, boolean status, int maxSpeed, String category, String flyingStyle, int wingSpan) {
        super(model, manufacturer, length, width, hight, wheelBase, weight, price, torque, power, speed, status, maxSpeed, category);
        this.flyingStyle = flyingStyle;
        this.wingSpan = wingSpan;
    }

    public String getFlyingStyle() {
        return flyingStyle;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void takeOff() {
        System.out.println("Car is in the air ");
        setStatus(true);
    }

    public void land() {
        setStatus(false);
        speed = 0;
        System.out.println("Car has landed");
    }

    public void display() {
        super.display();
        System.out.println("Flying style of the car is : " + flyingStyle);
        System.out.println("Wingspan : " + wingSpan);
    }


}
