package com.fireuprecruitmentproject.rent_car.repository;

import com.fireuprecruitmentproject.rent_car.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

}
