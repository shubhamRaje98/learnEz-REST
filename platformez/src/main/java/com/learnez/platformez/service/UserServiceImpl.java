package com.learnez.platformez.service;


import com.learnez.platformez.model.User;
import com.learnez.platformez.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepo;
    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }
}
