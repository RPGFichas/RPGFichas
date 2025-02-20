package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.EntityNotFoundException;
import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public UserModel findUserById(Long id) {
        return userRepository.findById(id)
        .orElseThrow(()-> new EntityNotFoundException(
            (id == 0 ? "User not found." :
            "User id " + id + " not found.")));
    }

}
