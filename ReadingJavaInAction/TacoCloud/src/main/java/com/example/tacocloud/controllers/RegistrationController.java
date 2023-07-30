package com.example.tacocloud.controllers;

import com.example.tacocloud.user.User;
import com.example.tacocloud.user.Users;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/registration")
@SessionAttributes("users")
public class RegistrationController {


    @GetMapping()
    public String showRegistrationForm(){
        return "registration";
    }

    @PostMapping()
    public String registerUser(User user, @ModelAttribute Users users){
        users.addUser(user);
        log.info("Processing user: {}", user);
        return "registration";
    }

    @ModelAttribute(name = "users")
    public Users Users(){
        return new Users();
    }

    @ModelAttribute(name = "user")
    public User user(){
        return new User();
    }
}
