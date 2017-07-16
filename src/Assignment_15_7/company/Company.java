package Assignment_15_7.company;

import Assignment_15_7.City;
import Assignment_15_7.Year;

/**
 * Created by jagtapm on 7/16/2017.
 */
public class Company {
    String name;
    long strength;
    City city;

    public Company(String name, long strength, City city) {
        this.name = name;
        this.strength = strength;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public long getStrength() {
        return strength;
    }

    public City getCity() {
        return city;
    }





}
