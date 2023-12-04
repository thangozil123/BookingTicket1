package com.example.BookingTicket.api;

import com.example.BookingTicket.entity.User;
import com.example.BookingTicket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserApi {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User create(@RequestBody User user) {return userService.create(user); }
}
