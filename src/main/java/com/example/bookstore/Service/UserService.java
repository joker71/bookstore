package com.example.bookstore.Service;

import com.example.bookstore.Repository.UserRepository;

import java.util.List;
import java.util.Optional;

import com.example.bookstore.Model.*;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserService {
    UserRepository userRepository;
    public UserService (UserRepository userRepository)
    {
        this.userRepository= userRepository;
    }
    @GetMapping("/user")
    public List<Users> getUser()
    {
        return this.userRepository.findAll();
    }
    @GetMapping("/user/{id}")
    public Optional<Users> getMethodName(@PathVariable("id") String userid) {
        return this.userRepository.findById(userid);
    }

}
