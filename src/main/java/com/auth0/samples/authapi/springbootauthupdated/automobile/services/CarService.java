package com.auth0.samples.authapi.springbootauthupdated.automobile.services;

import com.auth0.samples.authapi.springbootauthupdated.automobile.CarRepository;
import com.auth0.samples.authapi.springbootauthupdated.automobile.CategoryRepository;
import com.auth0.samples.authapi.springbootauthupdated.automobile.model.Car;
import com.auth0.samples.authapi.springbootauthupdated.automobile.model.Category;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CarService {


    CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Collection<Car> findAll() {
        return carRepository.findAll();
    }

    public Collection<Car> findTop(Integer limit) {
        return carRepository.findAll(PageRequest.of(0, limit)).getContent();
    }
}
