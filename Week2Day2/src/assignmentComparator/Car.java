package assignmentComparator;

/**
 * Created by jagtapm on 7/25/2017.
 */
public class Car implements Comparable<Car>{
    private int id;
    private double price;
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
        if (this.getPrice() == car.getPrice())
            return 0;
        else if (this.getPrice() > car.getPrice())
            return 1;
        else
            return -1;
    }
}
