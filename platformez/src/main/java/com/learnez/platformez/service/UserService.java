package com.learnez.platformez.service;


import com.learnez.platformez.model.User;
import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public User saveUser(User user);
    public User updateUser(User user);
    public void deleteUser(Long id);
}

