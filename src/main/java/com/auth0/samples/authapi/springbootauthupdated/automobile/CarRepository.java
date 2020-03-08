package com.auth0.samples.authapi.springbootauthupdated.automobile;

import com.auth0.samples.authapi.springbootauthupdated.automobile.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.Collection;

public interface CarRepository extends JpaRepository<Car, Long> {
}
