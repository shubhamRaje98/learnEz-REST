package com.learnez.platformez.controller;


import com.learnez.platformez.model.User;
import com.learnez.platformez.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @PostMapping("/add-user")
    public User saveUser(@RequestBody User user)
    {
        System.out.println("Adding new user: "+user.getUsername());
        return userService.saveUser(user);
    }
    @PutMapping("/update-user")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
    @DeleteMapping("/delete-user/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "Record deleted successfully";
    }
}
