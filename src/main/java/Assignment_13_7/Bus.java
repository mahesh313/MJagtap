package Assignment_13_7;

/**
 * Created by jagtapm on 7/13/2017.
 */
public class Bus extends Automobile{
    int load;
    String type;

    public Bus() {

    }

    public Bus(String model, String manufacturer, int length, int width, int hight, int wheelBase, int weight, double price, int torque, int power, int speed, boolean status, int maxSpeed, int load, String type) {
        super(model, manufacturer, length, width, hight, wheelBase, weight, price, torque, power, speed, status, maxSpeed);
        this.load = load;
        this.type = type;
    }

    public int getLoad() {
        return load;
    }

    public String getType() {
        return type;
    }

    public void display(){
        super.display();
        System.out.println("load : " + load);
        System.out.println("type : " + type);
    }


}
