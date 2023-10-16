package com.yassir.module.controllers;

import com.yassir.module.entities.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.yassir.module.services.userService;

import java.util.List;


@RestController
    @RequestMapping("/api/users")
    @AllArgsConstructor
    public class userController {
    private userService userService;
    @GetMapping
    public List getAllUsers(){
        return userService.getAllUsers();
    }

        @GetMapping("/{ID}")
        public User getUserById(@PathVariable(name = "ID") Long userID){
            return userService.getUserById(userID);
        }
        @PostMapping
        public User CreateUser(@RequestBody User user){
        return userService.createUser(user);
        }
        @PutMapping("/{ID}")
        public User updateUser(@PathVariable(name = "ID") Long userID ,  @RequestBody User user){
        user.setId(userID);
        return userService.updateUser(user);}

            @DeleteMapping("/{Id}")
            public void deleteUser(@PathVariable(name = "Id") Long userId) {
                userService.deleteUser(userId);
            }




    }
