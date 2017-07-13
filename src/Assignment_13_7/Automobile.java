package Assignment_13_7;

/**
 * Created by jagtapm on 7/13/2017.
 */
public class Automobile {
    public String model;
    public String manufacturer;
    public int length;
    public int width;
    public int hight;
    public int wheelBase;
    public int weight;
    public double price;
    public int torque;
    public int power;
    public int speed;
    public boolean status;
    public int maxSpeed;

    Automobile() {

    }

    Automobile(String model, String manufacturer, int length, int width, int hight, int wheelBase, int weight, double price, int torque, int power, int speed, boolean status, int maxSpeed) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.length = length;
        this.width = width;
        this.hight = hight;
        this.wheelBase = wheelBase;
        this.weight = weight;
        this.price = price;
        this.torque = torque;
        this.power = power;
        this.speed = speed;
        this.status = status;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHight() {
        return hight;
    }

    public int getWheelBase() {
        return wheelBase;
    }

    public int getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public int getTorque() {
        return torque;
    }

    public int getPower() {
        return power;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }


    public void start() {
        System.out.println("Automobile has started ");
        setStatus(true);
    }

    public void stop() {
        setStatus(false);
        speed = 0;
        System.out.println("Automobile has stopped");
    }

    public void brake(){
        speed -= 10;
        if (speed < 0){
            speed = 0;
        }
        System.out.println("Automile's speed has decreased to " + getSpeed());
    }

    public void accelerate(){
        speed += 10;
        if (speed > maxSpeed){
            speed = maxSpeed;
        }
        System.out.println("Automile's speed has increased to " + getSpeed());
    }

    public void display() {
        System.out.println("model : " + model);
        System.out.println("manufacturar : " + manufacturer);
        System.out.println("length : " + length);
        System.out.println("width : " + width);
        System.out.println("hight : " + hight);
        System.out.println("wheelBase : " + wheelBase);
        System.out.println("weight : " + weight);
        System.out.println("price : " + price);
        System.out.println("torque : " + torque);
        System.out.println("power : " + power);
        System.out.println("speed : " + speed);
        System.out.println("status : " + status);
        System.out.println("maxSpeed : " + maxSpeed);
    }




}
