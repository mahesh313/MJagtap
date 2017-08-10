package com.example.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Car {


    private String vin;
    private String model;
    private String name;
    private String make;


    private double price;
    private int qty;

    //default constructor required for jaxB
    public Car() {}

    public Car(String vin, String model, String name, String make, double price, int qty) {
        this.vin = vin;
        this.model = model;
        this.name = name;
        this.make = make;
        this.price = price;
        this.qty = qty;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @XmlElement(name = "CarName")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }
    @XmlTransient
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (Double.compare(car.price, price) != 0) return false;
        if (qty != car.qty) return false;
        if (vin != null ? !vin.equals(car.vin) : car.vin != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        if (name != null ? !name.equals(car.name) : car.name != null) return false;
        return make != null ? make.equals(car.make) : car.make == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = vin != null ? vin.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (make != null ? make.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + qty;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin='" + vin + '\'' +
                ", model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", make='" + make + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
