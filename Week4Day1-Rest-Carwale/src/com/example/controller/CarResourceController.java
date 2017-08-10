package com.example.controller;

import com.example.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.dao.CarDao;

import java.util.Collection;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;
import static org.springframework.util.MimeTypeUtils.APPLICATION_XML_VALUE;
import static org.springframework.util.MimeTypeUtils.TEXT_PLAIN_VALUE;

@RestController
public class CarResourceController {

    @Autowired
    CarDao carDao;


    @RequestMapping(value = "/cars",produces = APPLICATION_JSON_VALUE ,method = RequestMethod.GET)
    public Collection<Car> readAllCarsAsJson(){
        return carDao.selectAll();
    }

    @RequestMapping(value = "/cars",produces = APPLICATION_XML_VALUE ,method = RequestMethod.GET)
    public Collection<Car> readAllCarsAsXML(){
        return carDao.selectAll();
    }

    @RequestMapping(value = "car", produces = "text/plain", method = RequestMethod.GET)
    public String readCar() {
        return "vin - 100, model - Q7, make - Audi, price - 7657476465767, qty - 100";
    }

    @RequestMapping(value = "car", produces = "application/xml", method = RequestMethod.GET)
    public Car readCarbyXml(){
            return carDao.selectByVin("fddh");


    }

    @RequestMapping(value = "car", produces = "application/json", method = RequestMethod.GET)
    public Car readCarbyJson(){
        return carDao.selectByVin("101");


    }

    @RequestMapping(value = "/delete/{vin}",produces = TEXT_PLAIN_VALUE ,method = RequestMethod.DELETE)
    public String deleteCar(@PathVariable String vin){
        carDao.delete(vin);
        return "Car with vin '"+vin+"'resource deleted successfully!";
    }

    @RequestMapping(value = "/update/{vin}",consumes = APPLICATION_JSON_VALUE ,produces = TEXT_PLAIN_VALUE ,method = RequestMethod.PUT)
    public String updateCar(@RequestBody Car car, @PathVariable String vin){
        car.setVin(vin);
        String value = carDao.update(vin,car);
        return "Car with vin '"+value+" ' resource updated successfully!";
    }


    @RequestMapping(value = "/add",consumes = APPLICATION_JSON_VALUE ,produces = TEXT_PLAIN_VALUE ,method = RequestMethod.POST)
    public String addCar(@RequestBody Car car){
        System.out.println(car);
        int value = carDao.save(car);
        return "Car with vin '"+value+" ' resource added successfully!";
    }

    @RequestMapping(value = "/car/{vin}",produces = APPLICATION_JSON_VALUE ,method = RequestMethod.GET)
    public Car readCarByVinAsJson(@PathVariable String vin){
        System.out.println("VIN is : "+vin);
        Car car = carDao.selectByVin(vin);
        return car;
    }


    @RequestMapping(value = "/car",produces = APPLICATION_JSON_VALUE ,method = RequestMethod.GET)
    public Car readCarAsJson(){
        Car car = carDao.selectByVin("1000");
        return car;
    }



}
