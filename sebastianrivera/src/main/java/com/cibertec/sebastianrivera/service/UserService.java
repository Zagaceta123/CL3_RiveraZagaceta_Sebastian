package com.cibertec.sebastianrivera.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.sebastianrivera.model.User;
import com.cibertec.sebastianrivera.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Transactional
    public User registerUser(User user) {
        return userRepository.save(user);
    }
}