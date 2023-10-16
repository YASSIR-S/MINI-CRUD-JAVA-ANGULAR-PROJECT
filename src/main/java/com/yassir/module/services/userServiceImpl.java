package com.yassir.module.services;

import com.yassir.module.entities.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.yassir.module.repositories.userRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class userServiceImpl implements userService {

    private userRepository userRepository;

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long userID) {
        userRepository.deleteById(userID);

    }

    @Override
    public User getUserById(Long userID) {
        return userRepository.getById(userID);
    }



    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }
}
