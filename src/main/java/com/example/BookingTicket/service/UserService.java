package com.example.BookingTicket.service;

import com.example.BookingTicket.entity.User;
import com.example.BookingTicket.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User create(User user) {return userRepository.save(user);}
}
