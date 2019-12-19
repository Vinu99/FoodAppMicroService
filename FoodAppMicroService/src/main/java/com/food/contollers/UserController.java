package com.food.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.food.model.Users;
import com.food.services.UserService;

import java.util.List;

@RestController
@RequestMapping(value = "/food/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/all")
    public List<Users> getAll() {
        return userService.findAll();
    }

    @PostMapping(value = "/load")
    public List<Users> persist(@RequestBody final Users users) {
    	userService.save(users);
        return userService.findAll();
    }

}