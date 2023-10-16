package com.yassir.module.services;

import com.yassir.module.entities.User;

import java.util.List;

public interface userService {
    List<User> getAllUsers();

    User createUser(User user);
    void deleteUser(Long userID);
    User getUserById(Long userID);

    User updateUser(User user);
}
