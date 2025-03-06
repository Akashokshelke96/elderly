package com.techshelke.elderly.service;

import com.techshelke.elderly.model.User;

import java.util.Optional;

public interface UserService {
    User registerUser(User user);
    Optional<User> getUserByEmail(String email);
    Optional<User> getUserByPhoneNumber(String phoneNumber);
}
