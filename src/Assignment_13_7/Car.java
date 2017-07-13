package Assignment_13_7;

/**
 * Created by jagtapm on 7/13/2017.
 */
public class Car extends Automobile {

    protected String category;

    public Car() {

    }

    public Car(String model, String manufacturer, int length, int width, int hight, int wheelBase, int weight, double price, int torque, int power, int speed, boolean status, int maxSpeed, String category) {
        super(model, manufacturer, length, width, hight, wheelBase, weight, price, torque, power, speed, status, maxSpeed);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void display(){
        super.display();
        System.out.println("category of the car is : " + category);
    }



}
