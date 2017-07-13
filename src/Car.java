/**
 * Created by jagtapm on 7/13/2017.
 */
public class Car {
    String model;
    short noOfWheels;
    String category;
    double price;
    String color;
    float speed;

    void carstart() {
        System.out.println("Car has started");
    }

    void carstop() {
        System.out.println("Car has stopped");
    }

    void carBreak() {
        speed -= 10;
        if(speed < 0) {
            speed = 0;
        }
        System.out.println("Speed has been decreased to " + speed);
    }

    void accelerate(){
        speed += 10;
        if (speed > 300) {
            speed = 300;
        }
        System.out.println("Speed has been increased to " + speed);
    }



}

