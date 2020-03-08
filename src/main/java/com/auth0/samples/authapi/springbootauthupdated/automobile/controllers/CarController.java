package com.auth0.samples.authapi.springbootauthupdated.automobile.controllers;

import com.auth0.samples.authapi.springbootauthupdated.automobile.model.Car;
import com.auth0.samples.authapi.springbootauthupdated.automobile.services.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RequestMapping("api/cars")
@RestController
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public Collection<Car> findAll() { return carService.findAll(); }

    @GetMapping("used-cars")
    public Collection<Car> findTop(@RequestParam Integer limit) {
        return carService.findTop(limit);
    }

}
