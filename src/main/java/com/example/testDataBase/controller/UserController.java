package com.example.testDataBase.controller;

import com.example.testDataBase.entity.UserEntity;
import com.example.testDataBase.exception.UserAllreadyExistsException;
import com.example.testDataBase.exception.UserNotFindAllExeption;
import com.example.testDataBase.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public ResponseEntity getUsers() {
        try {
            //userService.getAllUsers();
            return ResponseEntity.ok(userService.getAllUsers());
        } catch (UserNotFindAllExeption e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @PostMapping("/addUser")
    public ResponseEntity addUser(@RequestBody UserEntity user) {
        try {
            userService.addUser(user);
            return ResponseEntity.ok("Ok. Пользователь сохранен");
        } catch (UserAllreadyExistsException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка сохранения пользователя!");
        }

    }
}
