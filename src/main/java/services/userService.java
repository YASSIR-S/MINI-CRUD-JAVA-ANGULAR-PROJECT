package services;

import entities.User;

public interface userService {
    User createUser(User user);
    void deleteUser(Long userID);
    User getUserById(Long userID);

    User updateUser(User user);
}
