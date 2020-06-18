package com.fireuprecruitmentproject.rent_car.controller;

import com.fireuprecruitmentproject.rent_car.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/cars")
public class CarController {
    private CarRepository carRepository;

    @Autowired
    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping("/all")
    public ModelAndView showAllCars(){
        Map<String,Object> cars = new HashMap<>();
        cars.put("samochody",carRepository.findAll());
        return new ModelAndView("samochody",cars);
    }


}
