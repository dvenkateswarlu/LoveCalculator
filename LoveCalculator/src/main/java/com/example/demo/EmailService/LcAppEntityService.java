package com.example.demo.EmailService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.EntityClass.Repo.UserRepo;
import com.example.demo.EntityClass.UserEntity;

@Service
public class LcAppEntityService {

    @Autowired
    private UserRepo userRepo;

    public Optional<UserEntity> authenticate(String email, String password) {
        return userRepo.findByEmailAndPassword(email, password);
    }
}
