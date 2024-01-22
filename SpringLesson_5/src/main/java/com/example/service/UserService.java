package com.example.service;

import com.example.model.User;
import com.example.repositiry.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        userRepository.save(new User(null, "Dvfv", "vxzvf@mail,ru"));
        userRepository.save(new User(null, "Gsfhsh", "vxz5555vf@mail,ru"));
        userRepository.save(new User(null, "Msthrthsf", "vx6434534f@mail,ru"));
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).get();
    }

}
