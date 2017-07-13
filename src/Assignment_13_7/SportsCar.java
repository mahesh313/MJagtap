package Assignment_13_7;

/**
 * Created by jagtapm on 7/13/2017.
 */
public class SportsCar extends Car {
    private String bodyStyle;

    public SportsCar() {
    }

    public SportsCar(String model, String manufacturer, int length, int width, int hight, int wheelBase, int weight, double price, int torque, int power, int speed, boolean status, int maxSpeed, String category, String bodyStyle) {
        super(model, manufacturer, length, width, hight, wheelBase, weight, price, torque, power, speed, status, maxSpeed, category);
        this.bodyStyle = bodyStyle;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void brake(){
        speed -= 50;
        if (speed < 0){
            speed = 0;
        }
        System.out.println("Sport car's speed has decreased to " + getSpeed());
    }

    public void accelerate(){
        speed += 50;
        if (speed > maxSpeed){
            speed = maxSpeed;
        }
        System.out.println("Sport car's speed has increased to " + getSpeed());
    }

    public void display() {
        super.display();
        System.out.println("Style of the sports car is : " + bodyStyle);
    }


}
