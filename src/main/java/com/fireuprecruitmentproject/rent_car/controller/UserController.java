package com.fireuprecruitmentproject.rent_car.controller;

import com.fireuprecruitmentproject.rent_car.entity.User;
import com.fireuprecruitmentproject.rent_car.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
    private UserRepo userRepo;

    @Autowired
    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    private void saveUser(User user) {
        userRepo.save(user);
    }
}
