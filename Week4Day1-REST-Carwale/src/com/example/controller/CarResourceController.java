package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarResourceController {

    @RequestMapping(value = "car", produces = "text/plain", method = RequestMethod.GET)
    public String readCar() {
        return "vin - 100, model - Q7, make - Audi, price - 7657476465767, qty - 100";
    }
}
