package com.example.dao;


import com.example.model.Car;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CarDao {
    Map<String, Car> cars;

    @PostConstruct
    public void init() {
        cars = new HashMap<>();
        cars.put("101", new Car("101", "dhoom", "machale", "2019", 846586846, 1));
        cars.put("201", new Car("201", "A1", "Audi", "2018", 846586846, 2));
        cars.put("301", new Car("301", "Q7", "BMW", "2017", 846586846, 3));
        cars.put("401", new Car("401", "XE", "Audi", "2017", 846586846, 4));

    }

    @PreDestroy
    public void clean() {
        cars.clear();
        cars = null;
    }

    
    public Car selectByVin(String vin) {
        return cars.get(vin);
    }


    public Collection<Car> selectAll() {
        return cars.values();
    }

    public void delete(String vin) {
        cars.remove(vin);
    }

    public String update(String vin, Car car) {
        cars.put(vin,car);
        return vin;
    }

    public String save(Car car) {
        cars.put(car.getVin(),car);
        return car.getVin();
    }
}
