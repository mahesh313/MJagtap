package assignmentComparator;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by jagtapm on 7/25/2017.
 */
public class Car implements Comparable<Car> {
    private int id;
    private double price;

    @Override
    public boolean equals(Object obj) {
        Car car = (Car)obj;
        if(this.getId() == car.getId() && this.getBrand().equals(car.getBrand()) && this.getPrice() == car.getPrice())
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return (this.getId() + this.getPrice() + this.getBrand()).hashCode();
    }

    @Override
    public String toString() {
        return "Car{ " +
                " id= " + id +
                ", price= " + price +
                ", brand= '" + brand + '\'' +
                '}';
    }

    private String brand;

    public Car() {}

    public Car(int id, double price, String brand) {
        this.id = id;
        this.price = price;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public int compareTo(Car car) {
        return (this.equals(car)) ? 0 : Double.compare(car.getPrice(), this.getPrice());
    }
}
