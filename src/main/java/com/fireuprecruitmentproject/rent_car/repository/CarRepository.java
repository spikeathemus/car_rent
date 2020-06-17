package com.fireuprecruitmentproject.rent_car.repository;

import com.fireuprecruitmentproject.rent_car.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Integer> {

}
